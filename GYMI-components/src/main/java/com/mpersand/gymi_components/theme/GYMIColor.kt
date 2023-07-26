package com.mpersand.gymi_components.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val P1 = Color(0xFF1063EE)
val P2 = Color(0xFF2575FC)
val P3 = Color(0xFF558FF1)

val LightN1 = Color(0xFF292E3D)
val LightN2 = Color(0xFF656B80)
val LightN3 = Color(0xFFBBBBCC)
val LightN4 = Color(0xFFE2E2EE)
val LightN5 = Color(0xFFF2F2F4)
val LightN6 = Color(0xFFFDFDFD)

val DarkN1 = Color(0xFFFDFDFD)
val DarkN2 = Color(0xFFF2F2F4)
val DarkN3 = Color(0xFFE2E2EE)
val DarkN4 = Color(0xFFBBBBCC)
val DarkN5 = Color(0xFF656B80)
val DarkN6 = Color(0xFF292E3D)

val LightBG = Color(0xFFFAFAFA)
val LightMD = Color(0xFFFFFFFF)

val DarkBG = Color(0xFF171E32)
val DarkMD = Color(0xFF4A4A50)

val S1 = Color(0xFFB84040)
val S2 = Color(0xFF2FAD52)
val S3 = Color(0xFFEEF5FD)

val Error = Color(0xFFFF5D5D)
val Positive = Color(0xFF49FF7C)

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)

class GYMIColor(
    p1: Color,
    p2: Color,
    p3: Color,
    n1: Color,
    n2: Color,
    n3: Color,
    n4: Color,
    n5: Color,
    n6: Color,
    bg: Color,
    md: Color,
    error: Color,
    positive: Color
) {
    var p1 by mutableStateOf(p1)
        private set

    var p2 by mutableStateOf(p2)
        private set

    var p3 by mutableStateOf(p3)
        private set

    var n1 by mutableStateOf(n1)
        private set

    var n2 by mutableStateOf(n2)
        private set

    var n3 by mutableStateOf(n3)
        private set

    var n4 by mutableStateOf(n4)
        private set

    var n5 by mutableStateOf(n5)
        private set

    var n6 by mutableStateOf(n6)
        private set

    var bg by mutableStateOf(bg)
        private set

    var md by mutableStateOf(md)
        private set

    var error by mutableStateOf(error)
        private set

    var positive by mutableStateOf(positive)
        private set

    fun update(gymiColor: GYMIColor) {
        this.p1 = gymiColor.p1
        this.p2 = gymiColor.p2
        this.p3 = gymiColor.p3
        this.n1 = gymiColor.n1
        this.n2 = gymiColor.n2
        this.n3 = gymiColor.n3
        this.n4 = gymiColor.n4
        this.n5 = gymiColor.n5
        this.n6 = gymiColor.n6
        this.bg = gymiColor.bg
        this.md = gymiColor.md
        this.error = gymiColor.error
        this.positive = gymiColor.positive
    }

    fun copy() = GYMIColor(
        p1 = p1,
        p2 = p2,
        p3 = p3,
        n1 = n1,
        n2 = n2,
        n3 = n3,
        n4 = n4,
        n5 = n5,
        n6 = n6,
        bg = bg,
        md = md,
        error = error,
        positive = positive
    )
}