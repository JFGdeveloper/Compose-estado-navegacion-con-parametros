package com.javidev.you_tube_dev_experto.ui.screens.detail

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import coil.annotation.ExperimentalCoilApi
import com.javidev.you_tube_dev_experto.modelo.getItem
import com.javidev.you_tube_dev_experto.ui.comons.appBar.scalfot.MiScaffod
import com.javidev.you_tube_dev_experto.ui.screens.main.ItemImagen
import com.javidev.you_tube_dev_experto.ui.screens.main.MiLaziColum

// RECIBE UN ID QUE ES EL DE LA IMAGEN PARA MOSTRAR LA IMAGEN ELEGIDA
@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun DetailScreen(idItem: Int,backOnClick: ()->Unit) {

    // PARA QUE CUANDO REPINTE COMPOSE SIEMPRE SEA EL MISMO
    val idImagen = remember { getItem().first() { it.id == idItem} }
    MiScaffod(
        content = {
            Box {
                ItemImagen(imagen = idImagen) {}
            }
        },
        backOnClick = { backOnClick() }

    )



}