/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.PetRepository
import com.example.androiddevchallenge.model.GENDER
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.model.Track

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DetailsScreen(id: Int, navController: NavController) {
    val pet = PetRepository.getPets().find { it.id == id } ?: Pet()
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = stringResource(R.string.details_screen)) },
                    backgroundColor = MaterialTheme.colors.primary,
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.Filled.ArrowBack, "Back")
                        }
                    },
                )
            }
        ) {
            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.surface)
            ) {
                item {
                    Header(pet = pet)
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                PaddingValues(
                                    top = 8.dp
                                )
                            )
                    ) {
                        Divider(color = Color.LightGray, thickness = 1.dp)
                        Text(
                            text = "Tracking",
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .background(Color.White)
                        )
                    }
                }
                items(pet.tracks) { track ->
                    TrackingRow(track)
                    Divider(color = Color.LightGray, thickness = 1.dp)
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun Header(pet: Pet) = Box(
    modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.BottomCenter
) {
    Image(
        painter = painterResource(pet.mainImage),
        contentDescription = pet.name,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .fillMaxWidth()
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, Color.Black),
                    0.0f,
                    200.0f
                )
            )
            .padding(16.dp)
    ) {
        Row {
            Text(
                text = pet.name,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Image(
                painter = painterResource(
                    if (pet.gender == GENDER.FEMALE)
                        R.drawable.ic_female
                    else
                        R.drawable.ic_male
                ),
                contentDescription = pet.name
            )
        }
        Text(
            text = pet.dateOfBirth,
            style = MaterialTheme.typography.subtitle1,
            color = Color.White
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun TrackingRow(track: Track) =
    Row(
        modifier = Modifier.fillMaxWidth(1.0f),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = track.info,
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier
                .weight(2f)
                .padding(8.dp)
        )
        Text(
            text = track.date,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
        )
    }

@Composable
@Preview
fun DetailsScreenPreview() {
    DetailsScreen(1, navController = rememberNavController())
}
