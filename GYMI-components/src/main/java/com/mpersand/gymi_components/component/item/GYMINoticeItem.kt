package com.mpersand.gymi_components.component.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun GYMINoticeItem(
    modifier: Modifier = Modifier,
    title: String,
    content: String,
    date: String
) {
    Surface(
        modifier = modifier,
        color = GYMITheme.colors.n5,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                    vertical = 14.dp
                )
        ) {
            Row {
                Text(
                    text = title,
                    style = GYMITheme.typography.h5
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = date,
                    style = GYMITheme.typography.body3
                )
            }
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = content,
                style = GYMITheme.typography.subtitle4
            )
        }
    }
}