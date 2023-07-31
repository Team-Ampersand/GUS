package com.mpersand.gymi_components.component.navbar

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun RowScope.GYMINavItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: @Composable () -> Unit,
    onClick: () -> Unit
) {
    val color = if (selected) GYMITheme.colors.p2 else GYMITheme.colors.n3

    CompositionLocalProvider(
        LocalContentColor provides color
    ) {
        Box(
            modifier = modifier
                .selectable(
                    selected = selected,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    indication = null,
                    role = Role.Tab,
                    onClick = onClick
                )
                .weight(1f)
        ) {
            Layout({
                Box(Modifier.layoutId("icon")) { icon() }
            }) { measurables, constraints ->
                val iconPlaceable = measurables.first { it.layoutId == "icon" }.measure(constraints)

                val width = constraints.maxWidth
                val height = constraints.maxHeight

                val iconX = (width - iconPlaceable.width) / 2
                val iconY = 15.dp.roundToPx()

                layout(width, height) {
                    iconPlaceable.placeRelative(iconX, iconY)
                }
            }
        }
    }
}