package com.mpersand.gymi_components.component.court

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.mpersand.gymi_components.R
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.theme.White

@Composable
fun GYMIBadmintonCourt(
    modifier: Modifier = Modifier,
    isReserved: Boolean,
    onClick: () -> Unit
) {
    var isClicked by remember { mutableStateOf(false) }

    Image(
        modifier = modifier.clickable {
                isClicked = !isClicked
                onClick()
            },
        painter = painterResource(id = R.drawable.ic_badminton_court),
        contentDescription = "badminton_court",
        contentScale = ContentScale.FillBounds,
        colorFilter = ColorFilter.tint(
            color = when {
                isClicked && !isReserved -> GYMITheme.colors.positive
                isReserved -> GYMITheme.colors.error
                else -> White
            },
            blendMode = BlendMode.Darken
        )
    )
}