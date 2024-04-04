package org.d3if0047.canvify.navigation

sealed class Screen (val route:String) {
    data object Home: Screen("mainScreen")
    data object Pallete : Screen("palleteScreen")
}