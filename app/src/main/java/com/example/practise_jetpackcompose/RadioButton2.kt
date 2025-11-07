package com.example.practise_jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GenderSelection(){
   val genders = arrayOf("Male", "Female", "Other")
    var selectedGender by remember {mutableStateOf("")}
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ){
        Text("Select Gender")
       genders.forEach { gender ->
           Row(verticalAlignment = Alignment.CenterVertically) {
               RadioButton(
                   selected = ( selectedGender == gender),
                   onClick = {selectedGender = gender}
               )
               Text(text = gender)
           }
       }
        Spacer(modifier = Modifier.height(20.dp))
        Text("Selected gender: $selectedGender")
    }
}


@Preview
@Composable
fun PreviewRadioButtonMin(){
    GenderSelection()
}