package com.example.factugest.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.factugest.ui.screens.clients.ClientsScreen
import com.example.factugest.ui.screens.home.HomeScreen
import com.example.factugest.ui.screens.invoices.InvoicesScreen
import com.example.factugest.ui.screens.settings.SettingsScreen

@Composable
fun FactuGestNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = FactuGestDestination.Home.route,
        modifier = modifier
    ) {
        composable(FactuGestDestination.Home.route) { HomeScreen() }
        composable(FactuGestDestination.Invoices.route) { InvoicesScreen() }
        composable(FactuGestDestination.Clients.route) { ClientsScreen() }
        composable(FactuGestDestination.Settings.route) { SettingsScreen() }
    }
}
