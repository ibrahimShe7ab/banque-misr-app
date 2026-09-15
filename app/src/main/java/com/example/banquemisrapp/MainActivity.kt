package com.example.banquemisrapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.os.LocaleListCompat
import com.example.banquemisrapp.ui.theme.BanqueMisrAppTheme

class MainActivity : ComponentActivity() {
    val appLocal = AppCompatDelegate.getApplicationLocales()
    val currentLocalTag = appLocal.get(0)?.toLanguageTag() ?: "ar"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanqueMisrAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column()   {
                           LogoAndLanguage() {

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
                           BanqueMisrApp(Modifier.padding(innerPadding))
                       }
                }
            }
        }
    }
}

