package com.example.loginapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
var finalEmail = ""
var finalPassword = ""
@Composable
fun LoginScreen(modifier: Modifier, navController: NavController){
Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement =Arrangement.Top, modifier = modifier.fillMaxSize()) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current
    Image(painter = painterResource(id = R.drawable.welcome_back), contentDescription = "Welcome Back", modifier = Modifier.padding(10.dp))
    OutlinedTextField(value = email,
        onValueChange = {
            email = it
        },
        placeholder = {
            Text(text = "Email Address")
        }
    )
Spacer(modifier = Modifier.padding(10.dp))
    OutlinedTextField(value = password,
        onValueChange = {
            password = it
        },
        placeholder = {
            Text(text = "Password")
        }
    )
   Row(modifier = Modifier
       .padding(horizontal = 16.dp, vertical = 20.dp)
       .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
       Button(onClick = {
           //val message = "Login Details\nEmail: $email\nPassword: $password"
           if(email.isNotEmpty() && password.isNotEmpty()){
               finalEmail = email
               finalPassword = password
               Toast.makeText(context, "Login Successful", Toast.LENGTH_LONG).show()
               navController.navigate("FinalScreen")
               //Navigation Logic is Here:

               email = ""
               password = ""
           }

           else {
               Toast.makeText(context, "Please enter email and password", Toast.LENGTH_SHORT).show()
       }


       }){
           Text(text = "Login")
       }
   }
    Text(text = "Forgot Password?", fontSize = 14.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
    Text(text = "Or, sign in with", fontSize = 14.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Normal)

    Row(modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 20.dp)
        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        Image(painter = painterResource(id = R.drawable.facebook), contentDescription ="facebook", contentScale = ContentScale.Fit, modifier = Modifier.size(60.dp))
        Image(painter = painterResource(id = R.drawable.google), contentDescription ="Google",  contentScale = ContentScale.Fit, modifier = Modifier.size(60.dp))
        Image(painter = painterResource(id = R.drawable.github), contentDescription ="Github", contentScale = ContentScale.Fit,modifier = Modifier.size(60.dp))
    }

}

}