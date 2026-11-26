package com.example.factugest.ui.screens.settings

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.factugest.R
import com.example.factugest.ui.components.ScreenPlaceholder
import com.example.factugest.ui.theme.FactuGestTheme

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    ScreenPlaceholder(
        title = stringResource(R.string.screen_settings),
        description = stringResource(R.string.settings_placeholder),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SettingsScreenPreview() {
    FactuGestTheme {
        SettingsScreen()
    }
}
