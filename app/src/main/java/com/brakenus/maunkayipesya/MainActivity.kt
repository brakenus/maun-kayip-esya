package com.brakenus.maunkayipesya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.brakenus.maunkayipesya.data.InMemoryItemRepository
import com.brakenus.maunkayipesya.ui.home.HomeScreen
import com.brakenus.maunkayipesya.ui.splash.SplashScreen
import com.brakenus.maunkayipesya.ui.theme.MaunKayipEsyaTheme

/**
 * Uygulamanın tek Activity giriş noktası.
 * Önce SplashScreen gösterilir; süre dolunca HomeScreen açılır.
 */
class MainActivity : ComponentActivity() {
    private val repository = InMemoryItemRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaunKayipEsyaTheme {
                var showSplash by remember { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen(onFinished = { showSplash = false })
                } else {
                    HomeScreen(items = repository.getRecentItems())
                }
            }
        }
    }
}
