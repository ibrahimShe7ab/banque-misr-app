package com.example.banquemisrapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResetPasswordEmail(modifier: Modifier = Modifier) {

    Text(
       text =  stringResource(R.string.forgot_username_password),
        modifier = Modifier.padding(start = 24.dp),
        fontWeight = FontWeight.SemiBold,
        color = Color.Gray,
        fontSize = 16.sp,
        textDecoration = TextDecoration.Underline
    )

}
