package com.example.banquemisrapp

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun BanqueMisrApp(modifier: Modifier = Modifier) {

    Column {

        Spacer(Modifier.padding(30.dp))
        UsernamePasswordET()
        Spacer(Modifier.padding(20.dp))
         HelpSection()
        Spacer(Modifier.padding(10.dp))
        HorizontalDivider(Modifier.padding(horizontal = 26.dp))
        Spacer(Modifier.padding(30.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Services(
                img = painterResource(R.drawable.our_products),
                serviceName = stringResource(R.string.our_product),
            )
            Services(
                img = painterResource(R.drawable.exchange_rate),
                serviceName = stringResource(R.string.exchange_rate),
            )
            Services(
                img = painterResource(R.drawable.security_tips),
                serviceName = stringResource(R.string.security_tips),
            )
            Services(
                img = painterResource(R.drawable.nearest_branch_or_atm),
                serviceName = stringResource(R.string.nearest_branch_or_atm),
            )
        }
    }
}

