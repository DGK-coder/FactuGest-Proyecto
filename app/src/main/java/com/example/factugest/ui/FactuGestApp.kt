package com.example.factugest.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.factugest.ui.navigation.FactuGestDestination
import com.example.factugest.ui.navigation.FactuGestNavHost
import com.example.factugest.ui.theme.FactuGestTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FactuGestApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = FactuGestDestination.entries.firstOrNull {
        it.route == backStackEntry?.destination?.route
    } ?: FactuGestDestination.Home

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text(stringResource(currentDestination.titleRes)) }) },
        bottomBar = {
            NavigationBar {
                FactuGestDestination.entries.forEach { destination ->
                    val title = stringResource(destination.titleRes)
                    NavigationBarItem(
                        selected = currentDestination == destination,
                        onClick = {
                            navController.navigate(destination.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        // Inicial provisional hasta incorporar los iconos del diseño.
                        icon = { Text(title.take(1)) },
                        label = { Text(title) }
                    )
                }
            }
        }
    ) { innerPadding ->
        FactuGestNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FactuGestAppPreview() {
    FactuGestTheme {
        FactuGestApp()
    }
}
