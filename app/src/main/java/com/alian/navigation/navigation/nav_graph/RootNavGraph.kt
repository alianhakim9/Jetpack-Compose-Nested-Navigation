package com.alian.navigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alian.navigation.screens.home.HomeScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Graph.AUTHENTICATION) {
        authNavGraph(navController)
        /** home route contains different nav host **/
        composable(route = Graph.HOME) {
            HomeScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}