package com.javidev.you_tube_dev_experto.ui.comons.appBar.scalfot

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.annotation.ExperimentalCoilApi
import com.javidev.you_tube_dev_experto.ui.screens.MainTopAppBar
import com.javidev.you_tube_dev_experto.ui.screens.main.MiLaziColum

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MiScaffod(content: @Composable () -> Unit,backOnClick: ()-> Unit={}) {

    Scaffold(
        topBar = {
            MainTopAppBar(backOnClick)
        }
    ) {
        content()
    }
}
