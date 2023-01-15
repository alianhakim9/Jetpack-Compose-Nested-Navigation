package com.alian.navigation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Home(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Home", style = MaterialTheme.typography.h4, fontWeight = FontWeight.Bold)
            Text(
                text = "Click here to detail",
                fontWeight = FontWeight.Light,
                modifier = Modifier.clickable {
                    onClick()
                })
        }
    }
}

@Composable
fun Profile() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Profile", style = MaterialTheme.typography.h4, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Settings() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Settings", style = MaterialTheme.typography.h4, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Information(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Information",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold
            )
            Text(text = "overview", modifier = Modifier.clickable {
                onClick()
            })
        }
    }
}

@Composable
fun Overview(onClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Overview",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                onClick()
            }
        )
    }
}