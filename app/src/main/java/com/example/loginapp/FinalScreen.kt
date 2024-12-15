package com.example.loginapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FinalScreen(email: String, password: String){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        OutputText("Welcome to Final Screen")
        Spacer(modifier = Modifier.padding(16.dp))
        OutputText("Login Details: ")
        OutputText("Email: $email")
        OutputText("Password: $password")
    }
}

@Composable
fun OutputText(text: String){
    Text(text = text,
        textAlign = TextAlign.Center,
        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
        fontSize = 30.sp)
}
