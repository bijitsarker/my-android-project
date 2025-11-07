package com.example.practise_jetpackcompose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SwitchButton(){
    var checkedState by remember {mutableStateOf(false)}
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        , verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = if(checkedState) "Switch on" else "Switch off")

        Switch(
            checked = checkedState,
            onCheckedChange = {checkedState = it},
            thumbContent = {
                if(checkedState) Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "checked")
                else Icon(imageVector = Icons.Default.Close, contentDescription = "Unchecked")
            },

        )
    }
}