package com.brakenus.maunkayipesya.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val MaunNavy = Color(0xFF1B365D)
val MaunBlue = Color(0xFF2563EB)
val MaunTeal = Color(0xFF0D9488)
val MaunBackground = Color(0xFFF8FAFC)
val MaunSurface = Color(0xFFFFFFFF)
val MaunTextDark = Color(0xFF0F172A)
val MaunTextMuted = Color(0xFF64748B)

private val LightColors = lightColorScheme(
    primary = MaunNavy,
    secondary = MaunTeal,
    tertiary = MaunBlue,
    background = MaunBackground,
    surface = MaunSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = MaunTextDark,
    onSurface = MaunTextDark
)

@Composable
fun MaunKayipEsyaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        content = content
    )
}
