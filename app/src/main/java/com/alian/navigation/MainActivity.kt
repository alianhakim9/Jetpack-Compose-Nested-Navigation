package com.alian.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.alian.navigation.navigation.nav_graph.RootNavGraph
import com.alian.navigation.ui.theme.NestedNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationTheme {
                RootNavGraph(navController = rememberNavController())
            }
        }
    }
}

