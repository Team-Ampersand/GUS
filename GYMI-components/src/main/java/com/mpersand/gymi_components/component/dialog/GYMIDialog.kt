package com.mpersand.gymi_components.component.dialog

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.mpersand.gymi_components.theme.White

@Composable
fun GYMIDialog(
    modifier: Modifier = Modifier,
    backgroundColor: Color = White,
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit,
    content: @Composable () -> Unit,
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Surface(
            modifier = modifier,
            color = backgroundColor,
            shape = RoundedCornerShape(16.dp)
        ) {
            content()
        }
    }
}