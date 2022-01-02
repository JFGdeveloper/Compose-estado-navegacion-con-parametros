package com.javidev.you_tube_dev_experto.ui.screens.main

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.javidev.you_tube_dev_experto.modelo.MediaItem
import com.javidev.you_tube_dev_experto.modelo.getItem
import com.javidev.you_tube_dev_experto.ui.screens.detail.Miapp


@Composable
fun ItemImagen(imagen: MediaItem, modifier: Modifier = Modifier, onclick: () -> Unit) {
    Column(modifier = modifier
        .padding(4.dp)
        .clickable { onclick() }) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberImagePainter(data = imagen.imagen),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green),
                contentScale = ContentScale.Crop
            )

            // SOLO SI ES IMAGEN MUSTRO EL ICONO
            if (imagen.type == MediaItem.Type.VIDEO){
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    tint = Color.Black
                )
            }


        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(4.dp)
        ) {
            Text(text = imagen.title, style = MaterialTheme.typography.h6)
        }


    }
}

@ExperimentalFoundationApi
@ExperimentalCoilApi
@Composable
fun MiLaziColum(onClickItem: (MediaItem) -> Unit) {


    LazyVerticalGrid(
        //modifier = Modifier.padding(4.dp),
        contentPadding = PaddingValues(2.dp),
        cells = GridCells.Adaptive(200.dp),
    ) {
        items(getItem()) { item ->
            Log.i("Milazy","el id del item es = ${item.id}")
            ItemImagen(imagen = item) {
                onClickItem(item) // obtengo el click del item
            }
        }
    }
}
