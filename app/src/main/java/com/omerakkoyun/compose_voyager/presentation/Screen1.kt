package com.omerakkoyun.compose_voyager.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

/**
 * Created by Omer AKKOYUN on 13.10.2024.
 */
class Screen1  : Screen {
    @Composable
    override fun Content() {
        var additionalInfo by remember { mutableStateOf("") }
        val navigator = LocalNavigator.current

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Screen 1", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(50.dp))
            TextField(
                value = additionalInfo,
                onValueChange = { additionalInfo = it },
                label = { Text("Additional Info", fontSize = 20.sp) }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navigator?.push(Screen2(value = additionalInfo))
            }) {
                Text(text = "Go to Screen 2", fontSize = 20.sp)

            }
        }

    }
}