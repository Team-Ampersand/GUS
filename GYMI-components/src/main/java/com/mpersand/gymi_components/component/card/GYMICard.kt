package com.mpersand.gymi_components.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun GYMICard(
    modifier: Modifier = Modifier,
    imageUrl: String,
    text: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier.size(150.dp),) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = rememberAsyncImagePainter(
                    model = imageUrl,
                    contentScale = ContentScale.Crop
                ),
                contentDescription = "Card Image"
            )
        }
        Spacer(modifier = modifier.height(7.dp))
        Text(
            text = text,
            style = GYMITheme.typography.body2,
            color = GYMITheme.colors.bw
        )
    }
}