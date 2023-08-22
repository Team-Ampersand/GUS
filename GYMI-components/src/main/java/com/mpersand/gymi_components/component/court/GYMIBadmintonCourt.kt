package com.mpersand.gymi_components.component.court

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.mpersand.gymi_components.R
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.theme.White

@Composable
fun GYMIBadmintonCourt(
    modifier: Modifier = Modifier,
    isReserved: Int,
    onClick: () -> Unit
) {
    var isClicked by remember { mutableStateOf(-1) }

    Column(modifier = modifier) {
        repeat(2) {
            Image(
                modifier = Modifier
                    .clickable {
                        isClicked = if (isClicked == it) -1 else it
                        onClick()
                    }
                    .graphicsLayer {
                        if (it % 2 != 0) rotationX = 180f
                    },
                painter = painterResource(id = R.drawable.ic_badminton_court),
                contentDescription = "badminton_court",
                contentScale = ContentScale.FillBounds,
                colorFilter = ColorFilter.tint(
                    color = when {
                        isClicked == it && isReserved != it -> GYMITheme.colors.positive
                        isReserved == it -> GYMITheme.colors.error
                        else -> White
                    },
                    blendMode = BlendMode.Darken
                )
            )
        }
    }
}