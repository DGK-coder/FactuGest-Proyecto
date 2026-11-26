package com.example.factugest.ui.screens.clients

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.factugest.R
import com.example.factugest.ui.components.ScreenPlaceholder
import com.example.factugest.ui.theme.FactuGestTheme

@Composable
fun ClientsScreen(modifier: Modifier = Modifier) {
    ScreenPlaceholder(
        title = stringResource(R.string.screen_clients),
        description = stringResource(R.string.clients_placeholder),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ClientsScreenPreview() {
    FactuGestTheme {
        ClientsScreen()
    }
}
