package com.javidev.you_tube_dev_experto.navigation

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.javidev.you_tube_dev_experto.ui.screens.detail.DetailScreen
import com.javidev.you_tube_dev_experto.ui.screens.detail.Miapp
import com.javidev.you_tube_dev_experto.ui.screens.main.MainScreen
import kotlinx.coroutines.currentCoroutineContext

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MiNavigation() {
    val navController = rememberNavController()

    // EN LOS COMPOSABLES SE DEFINE LA RRUTA Y LOS ARGUMENTOS

    NavHost(navController = navController, startDestination = Screen.main.ruta) {
        composable(route = Screen.main.ruta) {
           MainScreen{
               navController.navigate(Screen.detail.createRouteId(it.id))
           }
        }

        // PARA PASAR ARGUMENTOS SE LOS PASO POR {}
        // DECLARO LA PALABRA CLAVE PARA PASAR LOS ARGUMENTOS EJEM= itemId
        // Y PARA ACCEDER A ELLOS USO it: NAVBACKSTACKENTRY

        composable(
            route = Screen.detail.ruta,
            arguments = Screen.detail.args
        ) {
            val id = it.arguments?.getInt(NavArg.MediaId.key)
            // como puede ser nulo me aseguro con el metodo
            requireNotNull(id)
            DetailScreen(
                idItem= id,
                backOnClick= { navController.popBackStack()}
            )

        }
    }
}



