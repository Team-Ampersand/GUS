package com.mpersand.gymi_components.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.theme.White

@Composable
fun GYMIButton(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color = GYMITheme.colors.p1,
    style: TextStyle = GYMITheme.typography.subtitle3,
    contentPadding: Dp = 15.dp,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = White
        ),
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(vertical = contentPadding)
    ) {
        Text(
            text = text,
            style = style
        )
    }
}
