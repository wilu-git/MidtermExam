package com.example.midtermexam

import android.R.attr.onClick
import android.os.Bundle
import android.telephony.ims.SipDetails
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.remember
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.midtermexam.ui.theme.MidtermExamTheme
import org.intellij.lang.annotations.JdkConstants

@Composable
fun LoginScreen(
) {
    var username by remember {
        mutableStateOf("Louie")
    }

    var password by remember {
        mutableStateOf("••••••")
    }

    var email by remember {
        mutableStateOf("name@company.com")
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //TODO: Input Icon for delivery truck centered


        Text(
            text = "Welcome Back",
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 8.dp),
            fontSize = 36.sp,
        )
        Text(
            text = "Sign in to continue",
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 24.dp)
        )
        Text(
            text = "Email",
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )

        TextField (
            value = email,
            onValueChange = {
                email = it
            },
            singleLine = true,
            modifier = Modifier
                .padding(bottom = 18.dp)
                .fillMaxWidth()
        )

        Text (
            text = "Password",
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            modifier = Modifier
                .padding(bottom = 18.dp)
                .fillMaxWidth()

        )


        Button(
            onClick = {

            },
            modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxWidth()
                .height(60.dp)
                .padding(),

        ) {
            Text(
                text = "Sign In",
                color = Color.White
            )
        }

        Text (
            text = "Forgot Password?",
            color = Color.Blue,
            modifier = Modifier
                .clickable(onClick = {/*TODO: Click redirect*/})

        )


    }
}