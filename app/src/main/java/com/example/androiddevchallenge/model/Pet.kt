package com.example.androiddevchallenge.model

data class Pet(
    val id: Int = 0,
    val name: String = "",
    val gender: GENDER = GENDER.MALE,
    val dateOfBirth: String = "",
    val tracks: List<Track> = emptyList(),
    val mainImage: Int = 0
)

enum class GENDER {
    MALE, FEMALE
}

data class Track(
    val info: String,
    val date: String
)