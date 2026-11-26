package com.example.factugest.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.factugest.R
import com.example.factugest.ui.components.ScreenPlaceholder
import com.example.factugest.ui.theme.FactuGestTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    ScreenPlaceholder(
        title = stringResource(R.string.screen_home),
        description = stringResource(R.string.home_placeholder),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    FactuGestTheme {
        HomeScreen()
    }
}
