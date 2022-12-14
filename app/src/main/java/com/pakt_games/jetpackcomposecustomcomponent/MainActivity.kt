package com.pakt_games.jetpackcomposecustomcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pakt_games.jetpackcomposecustomcomponent.components.GenericButtonWithText
import com.pakt_games.jetpackcomposecustomcomponent.ui.theme.JetpackComposeCustomComponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCustomComponentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    GenericButtonWithText(stringResource(id = R.string.main_activity_component_generic_button_with_text))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCustomComponentTheme {
        Greeting()
    }
}