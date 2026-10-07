package com.pemmob.pipitanime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemmob.pipitanime.ui.screen.DetailScreen
import com.pemmob.pipitanime.ui.screen.HomeScreen
import com.pemmob.pipitanime.ui.theme.PipitAnimeTheme
import com.pemmob.pipitanime.viewmodel.AnimeViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: AnimeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PipitAnimeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "home") {
                        composable("home") {
                            HomeScreen(
                                viewModel = viewModel,
                                navigateToDetail = { malId ->
                                    navController.navigate("detail/$malId")
                                }
                            )
                        }
                        composable(
                            route = "detail/{malId}",
                            arguments = listOf(navArgument("malId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val malId = backStackEntry.arguments?.getInt("malId") ?: return@composable
                            DetailScreen(
                                malId = malId,
                                viewModel = viewModel,
                                onNavigateBack = { navController.popBackStack() }
                            )
                        }
                    }
                }
            }
        }
    }
}