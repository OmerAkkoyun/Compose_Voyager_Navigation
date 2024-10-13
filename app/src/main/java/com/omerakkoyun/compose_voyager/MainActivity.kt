package com.omerakkoyun.compose_voyager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.omerakkoyun.compose_voyager.presentation.Screen1
import com.omerakkoyun.compose_voyager.ui.theme.Compose_VoyagerTheme
import com.omerakkoyun.compose_voyager.ui.theme.Pink40
import com.omerakkoyun.compose_voyager.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_VoyagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Pink80
                ) {
                    Navigator(Screen1()){ navigator ->
                        SlideTransition(navigator)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_VoyagerTheme {
        Screen1()
    }
}