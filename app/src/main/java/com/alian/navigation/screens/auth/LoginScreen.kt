package com.alian.navigation.screens.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(
    onClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text(
                text = "LOGIN",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.clickable {
                    onClick()
                }
            )
            Text(
                text = "Sign Up",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Light,
                modifier = Modifier.clickable {
                    onSignUpClick()
                }
            )
            Text(
                text = "Forgot Password",
                style = MaterialTheme.typography.body2,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(top = 12.dp)
                    .clickable {
                        onForgotClick()
                    }
            )
        }
    }
}