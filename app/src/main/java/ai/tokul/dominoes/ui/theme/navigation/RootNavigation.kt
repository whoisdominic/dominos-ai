package ai.tokul.dominoes.ui.theme.navigation

import ai.tokul.dominoes.ui.theme.screens.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RootNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "landing") {
        composable("landing") { HomeScreen(navController = navController) }
        composable("camera") { CameraScreen(navController = navController) }
    }
}