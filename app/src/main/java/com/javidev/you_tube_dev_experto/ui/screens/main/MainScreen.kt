package com.javidev.you_tube_dev_experto.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.annotation.ExperimentalCoilApi
import com.javidev.you_tube_dev_experto.modelo.MediaItem
import com.javidev.you_tube_dev_experto.ui.comons.appBar.scalfot.MiScaffod
import com.javidev.you_tube_dev_experto.ui.screens.detail.Miapp

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MainScreen(onclick: (MediaItem)->Unit) {
    MiScaffod (
        content = {
            MiLaziColum() {
                onclick(it)
            }
        }
    )


}




