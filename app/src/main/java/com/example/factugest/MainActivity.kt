package com.example.factugest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.factugest.ui.FactuGestApp
import com.example.factugest.ui.theme.FactuGestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FactuGestTheme {
                FactuGestApp()
            }
        }
    }
}
