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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonMax(){
    var selectedOption by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {  Text("Select Option your choice")
        Row (verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = selectedOption == "Option 1",
                onClick = { selectedOption = "Option 1" }
            )
            Text(text = if (selectedOption == "Option 1") "Show Option 1" else "Hide Option 1",
                fontWeight = FontWeight.ExtraBold,
                color = if(selectedOption == "Option 1") Color.Green else Color.White
            )
        }
        Row (verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = selectedOption == "Option 2",
                onClick = { selectedOption = "Option 2" }
            )
            Text(text = if (selectedOption == "Option 2") "Show Option 2" else "Hide Option 2",
                fontWeight = FontWeight.Bold,
                color = if(selectedOption == "Option 2") Color.Red else Color.Yellow
                )
        }
        Row(verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = selectedOption == "Option 3",
                onClick = {selectedOption = "Option 3"}
            )
            Text(text = if(selectedOption=="Option 3") "Show Option 3"  else "Hide Option 3",
                fontWeight = FontWeight.ExtraBold,
                color = if(selectedOption == "Option 3") Color.Blue  else Color. Black
            )

        }
             Spacer(Modifier.height(20.dp))
        Text("Selected: $selectedOption")
    }
}
@Preview
@Composable
fun PreviewRadioButtonMax(){
    RadioButtonMax()
}
