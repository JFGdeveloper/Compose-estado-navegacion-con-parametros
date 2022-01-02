package com.javidev.you_tube_dev_experto.navigation

import androidx.navigation.NavArgs
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen(
    val route: String,
    val arguments: List<NavArg> = emptyList()
){
    object main: Screen("main")
    object detail: Screen("detail", listOf(NavArg.MediaId)){
        fun createRouteId(id:Int)= "$route/$id"
    }

    // para no pintar a mano la ruta: ruta/{args1}/{args2}

    val ruta = run{
        val key = arguments.map { "{${it.key}}" } // creamos la key
        listOf(route).plus(key).joinToString("/")   // pintamos la ruta completa
    }

    // lo mismo para los argumentos creo el objeto Navargument
    val args = arguments.map {
        navArgument(it.key){ type = it.navType}
    }
}


enum class NavArg(val key: String,val navType: NavType<*>){
    MediaId("itemId",NavType.IntType)
}
