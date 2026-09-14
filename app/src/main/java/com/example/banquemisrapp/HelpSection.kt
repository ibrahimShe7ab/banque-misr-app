package com.example.banquemisrapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banquemisrapp.ui.theme.textColor

@Composable
fun HelpSection(modifier: Modifier = Modifier) {
    val help = buildAnnotatedString {

        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontSize = 16.sp
            )
        ) {
            append(stringResource(R.string.need_help))

        }
        withStyle(
            style = SpanStyle(
                textColor,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                textDecoration = TextDecoration.Underline
            )
        ) {
            append(stringResource(R.string.contact_us))
        }


    }
    Text(text = help, modifier = Modifier.padding(horizontal = 26.dp))
}

