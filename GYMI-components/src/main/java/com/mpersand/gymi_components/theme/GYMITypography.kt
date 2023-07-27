package com.mpersand.gymi_components.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mpersand.gymi_components.R

val scdFont = FontFamily(
    Font(R.font.scd_bold, FontWeight.Bold),
    Font(R.font.scd_medium, FontWeight.Medium),
    Font(R.font.scd_regular, FontWeight.Normal)
)

object GYMITypography {
    @Stable
    val h1 = TextStyle(
        fontFamily = scdFont,
        fontSize = 48.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val h2 = TextStyle(
        fontFamily = scdFont,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val h3 = TextStyle(
        fontFamily = scdFont,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val h4 = TextStyle(
        fontFamily = scdFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = scdFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = scdFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    )

    @Stable
    val body3 = TextStyle(
        fontFamily = scdFont,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )

    @Stable
    val body4 = TextStyle(
        fontFamily = scdFont,
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal
    )

    @Stable
    val subtitle1 = TextStyle(
        fontFamily = scdFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val subtitle2 = TextStyle(
        fontFamily = scdFont,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val subtitle3 = TextStyle(
        fontFamily = scdFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )
}

internal val LocalTypography = staticCompositionLocalOf { GYMITypography }