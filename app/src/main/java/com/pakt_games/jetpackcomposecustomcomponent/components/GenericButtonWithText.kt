package com.pakt_games.jetpackcomposecustomcomponent.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import com.pakt_games.jetpackcomposecustomcomponent.R

@Composable
fun GenericButtonWithText(buttonText: String) {
    Button(
        modifier = Modifier.wrapContentHeight().wrapContentWidth(),
        onClick = { println("GenericButtonWithText Clicked") },
        border = BorderStroke(dimensionResource(id = R.dimen.common_1dp),
        color = colorResource(id = R.color.black)
        )
    ) {
        Text(text = buttonText, color = Color.White)
    }
}