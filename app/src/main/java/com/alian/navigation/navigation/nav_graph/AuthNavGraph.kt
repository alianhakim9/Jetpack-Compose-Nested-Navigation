package com.alian.navigation.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.alian.navigation.screens.auth.ForgotPasswordScreen
import com.alian.navigation.screens.auth.LoginScreen
import com.alian.navigation.screens.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthScreen.ForgotPassword.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route) {
            SignUpScreen()
        }
        composable(route = AuthScreen.ForgotPassword.route) {
            ForgotPasswordScreen()
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object ForgotPassword : AuthScreen(route = "FORGOT_PASSWORD")
}