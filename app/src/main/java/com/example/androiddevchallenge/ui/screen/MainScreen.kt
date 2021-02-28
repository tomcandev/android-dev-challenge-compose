package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.PetRepository
import com.example.androiddevchallenge.model.Pet

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen(onClickItem: (Pet) -> Unit) {
    val pets = remember { PetRepository.getPets() }
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.app_name)) },
                backgroundColor = MaterialTheme.colors.primary
            )
        }) {
            LazyVerticalGrid(
                cells = GridCells.Adaptive(minSize = 150.dp),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(pets) { pet ->
                    Box(modifier = Modifier.padding(8.dp)) {
                        Card(
                            shape = RoundedCornerShape(16.dp),
                            elevation = 8.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(150.dp)
                                .clickable { onClickItem.invoke(pet) }
                        ) {
                            Image(
                                painter = painterResource(pet.mainImage),
                                contentDescription = pet.name,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                            Box(
                                contentAlignment = Alignment.BottomCenter,
                                modifier = Modifier.background(
                                    Brush.verticalGradient(
                                        listOf(Color.Transparent, Color.Black),
                                        200.0f,
                                        500.0f
                                    )
                                )
                            ) {
                                Text(
                                    text = pet.name,
                                    style = MaterialTheme.typography.h6,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen {}
}