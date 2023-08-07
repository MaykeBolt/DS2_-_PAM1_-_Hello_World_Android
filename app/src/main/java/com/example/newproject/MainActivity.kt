package com.example.newproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newproject.ui.theme.NewprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Sonic R - Living in the City (Radical City)")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "$name \n\n" +
            "Living in the city\n" +
            "You know you have to survive\n" +
            "Living in the city\n" +
            "You've got to keep the dream alive\n" +
            "Living in the city\n" +
            "Where everything is free\n" +
            "Living in the city\n" +
            "Can't you see?\n" +
            "Living in the city\n" +
            "You know you have to survive\n" +
            "Living in the city\n" +
            "You've got to keep the dream alive\n" +
            "Living in the city\n" +
            "Where everything is free\n" +
            "Living in the city\n" +
            "Can't you see?\n" +
            "So many different things to see\n" +
            "There's no time\n" +
            "So many different things to do\n" +
            "But there's no time\n" +
            "So many people all around\n" +
            "So many feelings to be found\n" +
            "Living in a city where no one lets you down\n" +
            "Living in the city\n" +
            "You know you have to survive\n" +
            "Living in the city\n" +
            "You've got to keep the dream alive\n" +
            "Living in the city\n" +
            "Where everything is free\n" +
            "Living in the city\n")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewprojectTheme {
        Greeting("Sussy")
    }
}