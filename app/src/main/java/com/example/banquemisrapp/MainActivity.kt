package com.example.banquemisrapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.os.LocaleListCompat
import com.example.banquemisrapp.ui.theme.BanqueMisrAppTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanqueMisrAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column()   {
                           LogoAndLanguage()
                           BanqueMisrApp(Modifier.padding(innerPadding))
                       }
                }
            }
        }
    }
}

