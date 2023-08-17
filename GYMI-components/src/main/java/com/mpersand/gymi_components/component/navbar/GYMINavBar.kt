package com.mpersand.gymi_components.component.navbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.utils.GYMIDimen.NavBarHeight

@Composable
fun GYMINavBar(
    modifier: Modifier = Modifier,
    backgroundColor: Color = GYMITheme.colors.bg,
    content: @Composable RowScope.() -> Unit
) {
    Surface(color = backgroundColor) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(NavBarHeight)
                .selectableGroup(),
            horizontalArrangement = Arrangement.SpaceAround,
            content = content
        )
    }
}