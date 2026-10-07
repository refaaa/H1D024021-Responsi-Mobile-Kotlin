package com.pemmob.pipitanime.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary            = AnimeRed,
    onPrimary          = OnAnimeRed,
    primaryContainer   = AnimeRed,
    onPrimaryContainer = OnAnimeRed,
    background         = NeutralBg,
    surface            = NeutralSurface,
    onBackground       = DarkSurface,
    onSurface          = DarkSurface,
)

private val DarkColorScheme = darkColorScheme(
    primary            = AnimeRedLight,
    onPrimary          = OnAnimeRedLight,
    primaryContainer   = AnimeRedDark,
    onPrimaryContainer = OnAnimeRedDark,
    background         = DarkBg,
    surface            = DarkSurface,
    onBackground       = NeutralSurface,
    onSurface          = NeutralSurface,
)

@Composable
fun PipitAnimeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // dynamicColor dimatikan agar warna mengikuti custom theme, bukan mode HP
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = Typography,
        content     = content
    )
}