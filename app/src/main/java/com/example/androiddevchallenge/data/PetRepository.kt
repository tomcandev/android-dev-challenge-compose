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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.GENDER
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.model.Track

object PetRepository {
    fun getPets() = listOf(
        Pet(
            id = 0,
            name = "Tom",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_tom_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 1,
            name = "Thanos",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_thanos_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 2,
            name = "Thor",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_thor_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 3,
            name = "Black Widow",
            gender = GENDER.FEMALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_black_widow_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 4,
            name = "Loki",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_loki_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 5,
            name = "Caption Marvel",
            gender = GENDER.FEMALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_caption_marvel_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 6,
            name = "Hulk",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_hulk_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 7,
            name = "Spider Man",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_spider_man_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 8,
            name = "Ant Man",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_ant_man_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        ),
        Pet(
            id = 9,
            name = "Iron Man",
            gender = GENDER.MALE,
            dateOfBirth = "Jul 20th, 2020",
            mainImage = R.drawable.img_iron_man_1,
            tracks = listOf(
                Track(
                    info = "Dog Vaccine (Rabies 1-year)",
                    date = "Jan 1st, 2021"
                ),
                Track(
                    info = "Gain 1kg",
                    date = "Aug 1st, 2020"
                ),
                Track(
                    info = "Was born",
                    date = "Jul 20th, 2020"
                )
            )
        )
    )
}
