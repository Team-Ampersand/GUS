package com.mpersand.gymi_components.component.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mpersand.gymi_components.R
import com.mpersand.gymi_components.theme.GYMITheme

@Composable
fun GYMIHeader(
    modifier: Modifier = Modifier,
    background: Color,
    navigateToMain: () -> Unit,
    navigateToNotice: () -> Unit,
    navigationToProfile: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(background)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.clickable { navigateToMain() },
            painter = painterResource(id = R.drawable.ic_gymi_logo),
            contentDescription = "gymi_logo"
        )
        Spacer(modifier = modifier.weight(1f))
        Image(
            modifier = Modifier.clickable { navigateToNotice() },
            painter = painterResource(id = R.drawable.ic_bell),
            contentDescription = "bell"
        )
        Spacer(modifier = modifier.width(30.dp))
        Image(
            modifier = Modifier.clickable { navigationToProfile() },
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "profile"
        )
    }
}

@Preview
@Composable
fun GYMIHeaderPreview() {
    Column {
        GYMIHeader(
            background = GYMITheme.colors.n2,
            navigateToMain = {},
            navigateToNotice = {},
            navigationToProfile = {}
        )
        Spacer(modifier = Modifier.height(30.dp))
        GYMIHeader(
            background = GYMITheme.colors.n3,
            navigateToMain = {},
            navigateToNotice = {},
            navigationToProfile = {}
        )
    }
}