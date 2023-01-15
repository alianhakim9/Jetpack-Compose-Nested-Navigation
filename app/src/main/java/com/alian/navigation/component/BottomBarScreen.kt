package com.alian.navigation.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.alian.navigation.component.BottomBarGraph.BOTTOM_HOME
import com.alian.navigation.component.BottomBarGraph.PROFILE
import com.alian.navigation.component.BottomBarGraph.SETTINGS

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = BOTTOM_HOME,
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        route = PROFILE,
        title = "profile",
        icon = Icons.Default.Person
    )

    object Settings : BottomBarScreen(
        route = SETTINGS,
        title = "settings",
        icon = Icons.Default.Settings
    )
}

object BottomBarGraph {
    const val BOTTOM_HOME = "home"
    const val PROFILE = "profile_screen"
    const val SETTINGS = "settings_screen"
}