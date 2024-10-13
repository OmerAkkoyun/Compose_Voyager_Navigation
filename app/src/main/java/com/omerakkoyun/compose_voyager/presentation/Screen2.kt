package com.omerakkoyun.compose_voyager.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

/**
 * Created by Omer AKKOYUN on 13.10.2024.
 */
data class Screen2 (val value: String = "")  : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.current

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Screen 2", fontSize = 20.sp)
            Text(text = "$value", fontSize = 20.sp, color = androidx.compose.ui.graphics.Color.Blue)
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navigator?.pop()
            }) {
                Text(text = "Go to Back", fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navigator?.push(Screen3())
            }) {
                Text(text = "Go to Screen 3", fontSize = 20.sp)

            }
        }

    }
}