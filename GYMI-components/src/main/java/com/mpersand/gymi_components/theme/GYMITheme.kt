package com.mpersand.gymi_components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf

enum class Theme {
    LIGHT,
    DARK
}


private val GYMILightColors = GYMIColor(
    n1 = LightN1,
    n2 = LightN2,
    n3 = LightN3,
    n4 = LightN4,
    n5 = LightN5,
    n6 = LightN6,
    bg = LightBG,
    md = LightMD,
    hd = LightHD,
    bw = LightBW
)

private val GYMIDarkColors = GYMIColor(
    n1 = DarkN1,
    n2 = DarkN2,
    n3 = DarkN3,
    n4 = DarkN4,
    n5 = DarkN5,
    n6 = DarkN6,
    bg = DarkBG,
    md = DarkMD,
    hd = DarkHD,
    bw = DarkBW
)

private val LocalColorProvider = staticCompositionLocalOf { GYMILightColors }

@Composable
private fun GYMIThemeLocalProvider(
    colors: GYMIColor,
    typography: GYMITypography,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors.copy() }

    colorPalette.update(colors)
    CompositionLocalProvider(
        LocalColorProvider provides colorPalette,
        LocalTypography provides typography,
        content = content
    )
}

private val Theme.colors: GYMIColor
    get() = when (this) {
        Theme.DARK -> GYMIDarkColors
        Theme.LIGHT -> GYMILightColors
    }

object GYMITheme {
    val colors: GYMIColor
        @Composable
        get() = LocalColorProvider.current

    val typography: GYMITypography
        @Composable
        get() = LocalTypography.current

    var gymiTheme by mutableStateOf(Theme.LIGHT)

    fun isSystemIsDarkTheme(): Boolean {
        return gymiTheme == Theme.DARK
    }
}

@Composable
fun GYMITheme(
    gymiTheme: Theme = GYMITheme.gymiTheme,
    typography: GYMITypography = GYMITheme.typography,
    content: @Composable () -> Unit
) {
    GYMITheme.gymiTheme = if (isSystemInDarkTheme()) Theme.DARK else Theme.LIGHT

    GYMIThemeLocalProvider(
        colors = gymiTheme.colors,
        typography = typography,
        content = content
    )
}