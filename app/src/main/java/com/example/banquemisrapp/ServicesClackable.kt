package com.example.banquemisrapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun Services(
     img: Painter,

    serviceName: String,
 ) {
    Column(
         verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 10.dp)


    ) {
        Image(painter = img, contentDescription = null, modifier = Modifier.size(80.dp))
        Spacer(Modifier.padding(10.dp))
        Text(
            text = serviceName,
            modifier = Modifier.size(80.dp),

            fontWeight = FontWeight.SemiBold,
            color = Color.Gray
        )



    }

}
