package com.mpersand.gymi_components.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun GYMITextField(
    modifier: Modifier = Modifier,
    background: Color,
    value: String,
    textColor: Color,
    singleLine: Boolean = true,
    maxLine: Int = 1,
    focusColor: Color,
    placeholder: String,
    placeholderColor: Color,
    horizontalPadding: Dp,
    onValueChange: (String) -> Unit
) {
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    var isFocus by remember { mutableStateOf(false) }

    BasicTextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding)
            .background(
                color = background,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                width = 1.dp,
                color = if (isFocus) focusColor else background,
                shape = RoundedCornerShape(8.dp)
            )
            .focusRequester(focusRequester)
            .onFocusChanged {
                isFocus = it.isFocused
            },
        value = value,
        onValueChange = onValueChange,
        textStyle = GYMITheme.typography.body3.merge(TextStyle(color = textColor)),
        cursorBrush = SolidColor(textColor),
        singleLine = singleLine,
        maxLines = maxLine,
        visualTransformation = VisualTransformation.None,
        decorationBox = { innerTextField ->
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 15.dp)
            ) {
                if (value.isEmpty()) {
                    Text(
                        text = placeholder,
                        style = GYMITheme.typography.body3,
                        color = placeholderColor,
                    )
                }
                innerTextField()
            }
        }
    )
}
