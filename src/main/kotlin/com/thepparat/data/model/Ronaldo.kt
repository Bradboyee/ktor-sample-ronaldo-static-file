package com.thepparat.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Ronaldo(
    val name: String,
    val description: String,
    val imageUrl: String
)
