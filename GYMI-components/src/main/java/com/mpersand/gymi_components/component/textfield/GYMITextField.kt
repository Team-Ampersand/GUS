package com.mpersand.gymi_components.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.Black
import com.mpersand.gymi_components.theme.GYMITheme
import com.mpersand.gymi_components.theme.White

@Composable
fun GYMITextField(
    modifier: Modifier = Modifier,
    height: Dp,
    background: Color,
    value: String,
    textColor: Color,
    singleLine: Boolean = true,
    maxLine: Int = 1,
    focusColor: Color,
    placeholder: String,
    placeholderColor: Color,
    onValueChange: (String) -> Unit
) {
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    var isFocus by remember { mutableStateOf(false) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .padding(horizontal = 20.dp)
            .background(
                color = background,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                width = 1.dp,
                color = if (isFocus) focusColor else background,
                shape = RoundedCornerShape(8.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            modifier = modifier
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
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        if (value.isEmpty()) {
                            Text(
                                text = placeholder,
                                fontSize = GYMITheme.typography.body3.fontSize,
                                fontWeight = GYMITheme.typography.body3.fontWeight,
                                fontFamily = GYMITheme.typography.body3.fontFamily,
                                color = placeholderColor,
                            )
                        }
                    }
                    innerTextField()
                }
            }
        )
    }
}

@Preview
@Composable
fun preview() {
    var testText1 by remember { mutableStateOf("") }
    var testText2 by remember { mutableStateOf("") }

    Column {
        Spacer(modifier = Modifier.height(20.dp))

        GYMITextField(
            height = 50.dp,
            background = GYMITheme.colors.n2,
            value = testText1,
            onValueChange = { testText1 = it },
            textColor = White,
            focusColor = GYMITheme.colors.p1,
            placeholder = "빈 값입니다.",
            placeholderColor = GYMITheme.colors.n4
        )

        Spacer(modifier = Modifier.height(20.dp))

        GYMITextField(
            height = 50.dp,
            background = GYMITheme.colors.n4,
            value = testText2,
            onValueChange = { testText2 = it },
            textColor = Black,
            focusColor = GYMITheme.colors.p3,
            placeholder = "빈 값입니다.",
            placeholderColor = GYMITheme.colors.n2
        )
    }
}
