package com.mpersand.gymi_components.component.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun GYMIButton(
    modifier: Modifier = Modifier,
    text: String,
    colors: Color = GYMITheme.colors.p1,
    style: TextStyle = GYMITheme.typography.subtitle3,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = text,
            style = style
        )
    }
}
