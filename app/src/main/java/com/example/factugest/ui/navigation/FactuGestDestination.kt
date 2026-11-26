package com.example.factugest.ui.navigation

import androidx.annotation.StringRes
import com.example.factugest.R

// Rutas centralizadas para evitar cadenas repetidas en las pantallas.
enum class FactuGestDestination(val route: String, @param:StringRes val titleRes: Int) {
    Home("home", R.string.screen_home),
    Invoices("invoices", R.string.screen_invoices),
    Clients("clients", R.string.screen_clients),
    Settings("settings", R.string.screen_settings)
}
