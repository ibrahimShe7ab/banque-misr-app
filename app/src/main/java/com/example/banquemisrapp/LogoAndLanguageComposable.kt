package com.example.banquemisrapp

import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.os.LocaleListCompat
import com.example.banquemisrapp.ui.theme.textColor

@Composable
fun LogoAndLanguage(
    modifier: Modifier = Modifier

) {

    val appLocal = AppCompatDelegate.getApplicationLocales()
    val currentLocalTag = appLocal.get(0)?.toLanguageTag() ?: "ar"

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
            .padding(horizontal = 20.dp),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {Image(
            painter = painterResource(R.drawable.bm_icon),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.language),
            fontWeight = FontWeight.Bold,
            color = textColor,
            modifier = Modifier.clickable{
                val newLanguage =
                    if (currentLocalTag == "en") {
                        "ar"
                    } else {
                        "en"
                    }
                val localList = LocaleListCompat.forLanguageTags(newLanguage)
                Log.d("lang",newLanguage)

                AppCompatDelegate.setApplicationLocales(localList)

            }

        )
    }


}
