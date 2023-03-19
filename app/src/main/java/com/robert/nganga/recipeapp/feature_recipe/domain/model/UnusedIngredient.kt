package com.robert.nganga.recipeapp.feature_recipe.domain.model

data class UnusedIngredient(
    val aisle: String,
    val amount: Double,
    val id: Int,
    val image: String,
    val name: String,
    val original: String
)

