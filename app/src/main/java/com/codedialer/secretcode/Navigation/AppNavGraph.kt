package com.codedialer.secretcode.Navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.appNavGraph() {

    composable("home") {
        // HomeScreen()
    }

    composable("categories") {
        // CategoriesScreen()
    }

    composable("favorites") {
        // FavoritesScreen()
    }

    composable("details/{id}") {
        // DetailsScreen()
    }
}
