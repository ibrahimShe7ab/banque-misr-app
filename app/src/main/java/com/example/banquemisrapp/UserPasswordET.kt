package com.example.banquemisrapp

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.banquemisrapp.ui.theme.textColor

@Composable
fun UsernamePasswordET(modifier: Modifier = Modifier) {
    val userET = rememberTextFieldState("")
    val password = rememberTextFieldState("")
    val isVisible = userET.text.isNotEmpty() && password.text.isNotEmpty()

    OutlinedTextField(
        state = userET,
        placeholder = { Text(stringResource(R.string.username)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
        )
    )
    Spacer(Modifier.padding(20.dp))
    OutlinedTextField(
        state = password,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Blue,
            unfocusedTextColor = Color.Gray
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = (KeyboardType.Password),
        ),
        placeholder = { Text(text = stringResource(R.string.password)) },


        )


    Spacer(Modifier.padding(10.dp))

    ResetPasswordEmail()
    Spacer(Modifier.padding(10.dp))
    Button(
        onClick = {

        },
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(horizontal = 18.dp),
        colors = ButtonDefaults.buttonColors(

            textColor,
            disabledContentColor = Color.Gray,

            ),
        enabled = isVisible,
        shape = RoundedCornerShape(16.dp)


    ) {

        Text(text = stringResource(R.string.login))
    }


}