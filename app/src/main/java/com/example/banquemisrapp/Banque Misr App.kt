package com.example.banquemisrapp

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BanqueMisrApp(modifier: Modifier = Modifier) {

    Column {
        LogoAndLanguage()
        Spacer(Modifier.padding(20.dp))
        UsernamePasswordET()
        Spacer(Modifier.padding(20.dp))
        Spacer(Modifier.padding(10.dp))
        HelpSection()
        Spacer(Modifier.padding(20.dp))
        HorizontalDivider(Modifier.padding(horizontal = 26.dp))
        Spacer(Modifier.padding(30.dp))

   Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Services(
                img = painterResource(R.drawable.our_products),
                contentDC = "",
                serviceName = "Our \n product",
             )
            Services(
                img = painterResource(R.drawable.exchange_rate),
                contentDC = "",
                serviceName = "Exchange \n rate",
             )
            Services(
                img = painterResource(R.drawable.security_tips),
                contentDC = "Our",
                serviceName = "Security \n tips",
             )
       Services(
                img = painterResource(R.drawable.nearest_branch_or_atm),
                contentDC ="",
                serviceName = "nearest " +
                        "branch or \nATM",
             )
         }
    }
}

