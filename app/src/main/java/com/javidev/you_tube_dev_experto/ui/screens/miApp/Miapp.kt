package com.javidev.you_tube_dev_experto.ui.screens.detail

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.javidev.you_tube_dev_experto.ui.theme.You_tube_dev_expertoTheme

@Composable
fun Miapp(content: @Composable ()->Unit) {
    You_tube_dev_expertoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Cyan) {

            content()
        }
    }
}