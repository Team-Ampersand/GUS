package com.mpersand.gymi_components.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

enum class Theme {
    LIGHT,
    DARK
}

private val GYMILightColors = GYMIColor(
    n1 = Color(0xFF292E3D),
    n2 = Color(0xFF656B80),
    n3 = Color(0xFFBBBBCC),
    n4 = Color(0xFFE2E2EE),
    n5 = Color(0xFFF2F2F4),
    n6 = Color(0xFFFDFDFD),
    bg = Color(0xFFFAFAFA),
    md = Color(0xFFFFFFFF)
)

private val GYMIDarkColors = GYMIColor(
    n1 = Color(0xFFFDFDFD),
    n2 = Color(0xFFF2F2F4),
    n3 = Color(0xFFE2E2EE),
    n4 = Color(0xFFBBBBCC),
    n5 = Color(0xFF656B80),
    n6 = Color(0xFF292E3D),
    bg = Color(0xFF171E32),
    md = Color(0xFF4A4A50)
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
    get() = when(this) {
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
    GYMIThemeLocalProvider(
        colors = gymiTheme.colors,
        typography = typography,
        content = content
    )
}