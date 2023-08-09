package com.mpersand.gymi_components.component.snackbar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.theme.S1
import com.mpersand.gymi_components.theme.S2

@Composable
fun GYMISnackbar(
    modifier: Modifier = Modifier,
    title: String,
    content: String,
    isDone: Boolean
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        color = GYMITheme.colors.md,
        border = BorderStroke(
            width = 1.dp,
            color = if (!isDone) S1 else S2
        )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Text(
                text = title,
                style = GYMITheme.typography.subtitle2
            )
            Text(
                text = content,
                style = GYMITheme.typography.body3
            )
        }
    }
}