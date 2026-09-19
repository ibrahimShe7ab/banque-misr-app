package com.example.banquemisrapp

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.banquemisrapp.ui.theme.textColor

@Composable
fun UsernamePasswordET() {

    val userET = rememberTextFieldState("")
    val password = rememberTextFieldState("")

    var passwordVisibility by remember {
        mutableStateOf(false)
    }
    val isVisible =
        userET.text.isNotEmpty() &&
                password.text.isNotEmpty()



    OutlinedTextField(
        state = userET,
        placeholder = {
            Text(
                stringResource(R.string.username)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email
        )
    )

    Spacer(
        modifier = Modifier.height(40.dp)
    )

    OutlinedSecureTextField(
        state = password,

        placeholder = {
            Text(
                text = stringResource(R.string.password)
            )
        },

        keyboardOptions = KeyboardOptions(
            keyboardType =
                if (passwordVisibility) {
                    KeyboardType.PasswordVisible
                } else {
                    KeyboardType.Password
                }
        ),

        trailingIcon = {

            IconButton(
                onClick = {
                    passwordVisibility = !passwordVisibility
                }
            ) {

                Icon(
                    painter =
                        if (passwordVisibility) {
                            painterResource(R.drawable.visible)
                        } else {
                            painterResource(R.drawable.hide)
                        },

                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }
        },

        textObfuscationMode =
            if (passwordVisibility) {
                TextObfuscationMode.Visible
            } else {
                TextObfuscationMode.System
            },


        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    )
    Spacer(
        modifier = Modifier.height(25.dp)
    )

    ResetPasswordEmail()

    Spacer(
        modifier = Modifier.height(40.dp)
    )

    Button(
        onClick = {

        },

        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 18.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = textColor,
            disabledContentColor = Color.Gray
        ),
        enabled = isVisible,
        shape = RoundedCornerShape(16.dp)
    ) {

        Text(
            text = stringResource(R.string.login)
        )
    }
}

