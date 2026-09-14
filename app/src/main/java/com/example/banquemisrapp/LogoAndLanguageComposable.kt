package com.example.banquemisrapp

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.LocaleListCompat
import com.example.banquemisrapp.ui.theme.textColor

@Composable
fun LogoAndLanguage(
    modifier: Modifier = Modifier
) {

    val currentLocale =
        AppCompatDelegate
            .getApplicationLocales()
            .get(1)
            ?.toLanguageTag()

    val language =
        if (currentLocale == "ar") {
            "English"
        } else {
            "العربية"
        }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
            .padding(horizontal = 20.dp),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val currentLocale =
            AppCompatDelegate
                .getApplicationLocales()
                .get(0)
                ?.toLanguageTag()

        val newLocale =
            if (currentLocale == "ar") {
                "en"
            } else {
                "ar"
            }
        Image(
            painter = painterResource(R.drawable.bm_icon),
            contentDescription = null
        )


            Text(
                text = stringResource(R.string.language),
                modifier = Modifier.clickable {

                    AppCompatDelegate.setApplicationLocales(
                        LocaleListCompat.forLanguageTags(newLocale)

                    )
                },
                fontWeight = FontWeight.Bold,
                color = textColor
            )
        }


    }
