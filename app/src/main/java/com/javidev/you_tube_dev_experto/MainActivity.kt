package com.javidev.you_tube_dev_experto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi

import coil.annotation.ExperimentalCoilApi
import com.javidev.you_tube_dev_experto.navigation.MiNavigation



class MainActivity : ComponentActivity() {

    @ExperimentalCoilApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MiNavigation()

        }
    }

}




