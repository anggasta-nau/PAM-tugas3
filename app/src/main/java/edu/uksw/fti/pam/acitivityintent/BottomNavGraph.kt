package edu.uksw.fti.pam.acitivityintent

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.uksw.fti.pam.acitivityintent.screens.*
import edu.uksw.fti.pam.acitivityintent.ui.screens.FollowingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            LandingPage()
        }
        composable(route = BottomBarScreen.Following.route) {
            FollowingScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreenPreview()
        }
        composable(route = BottomBarScreen.Add.route) {
//            ProfileScreen()
        }
        composable(route = BottomBarScreen.Search.route) {
//            SettingsScreen()
        }
    }
}