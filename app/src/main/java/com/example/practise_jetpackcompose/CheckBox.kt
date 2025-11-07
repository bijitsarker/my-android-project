package com.example.practise_jetpackcompose

import android.widget.CheckBox
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CheckBox() {
    var reading by remember { mutableStateOf(false) }
    var gaming  by remember { mutableStateOf(false) }
    var traveling by remember { mutableStateOf(false) }

    val selected = listOfNotNull(
        if (reading) "Reading" else null,
        if(gaming) "Gaming" else null,
        if(traveling) "Traveling" else null
    )

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ){
        Text(text = "Select your hobby",
             fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = reading, onCheckedChange = { reading = it })
            Text ( text = "Reading" ,
                 color = if (reading) Color.Red else Color.Black
                )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = gaming, onCheckedChange = { gaming = it })
                        Text (text = "Gaming",
                            color = if(gaming) Color.Green else Color.Black
                        )
        }
        Row (verticalAlignment = Alignment.CenterVertically){
            Checkbox(checked = traveling, onCheckedChange = { traveling = it })
            Text (text = "Traveling" ,
                color = if (traveling) Color.Blue else Color.Black)
        }
        Spacer(Modifier.height(20.dp))
        Text("Selected your hobby is: ${if(selected.isEmpty()) "None" else selected}")
    }

}




@Preview
@Composable
fun PreviewCheckBox(){
    CheckBox()
}