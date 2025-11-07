package com.example.practise_jetpackcompose

import android.R
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun CreateButton(
    text: String,
    textColor: Color,
    //onClick: () -> Unit
){
    Button(
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Transparent
        ),
        onClick = {"Click"}
    ){}
}

@Preview
@Composable
fun ShowButton(){
    CreateButton(text = "Button",Color.White)
}