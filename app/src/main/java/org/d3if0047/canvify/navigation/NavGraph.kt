package org.d3if0047.canvify.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if0047.canvify.ui.screen.Mainscreen
import org.d3if0047.canvify.ui.screen.PalleteScreen


@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route){
            Mainscreen(navController)
        }

        composable(route = Screen.Pallete.route){
            PalleteScreen(navController)
        }

    }
}