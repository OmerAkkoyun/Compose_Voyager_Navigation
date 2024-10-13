package com.omerakkoyun.compose_voyager.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow

/**
 * Created by Omer AKKOYUN on 13.10.2024.
 */
class Screen3 : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.current

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Screen 3")
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navigator?.pop()
            }) {
                Text(text = "Go to Back")

            }

            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navigator?.popUntilRoot()
            }) {
                Text(text = "Go to Root Back")

            }
        }

    }
}