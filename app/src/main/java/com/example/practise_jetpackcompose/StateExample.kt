package com.example.practise_jetpackcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Preview
@Composable
fun StateExample(){
   var state by remember { mutableStateOf(false) }
   var count by remember{mutableStateOf(0)}
   Column(modifier = Modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
   ) {
      Button(onClick = {state = true}) {
         Text("Click")
      }
      if (state){
         Dialog(onDismissRequest = {state = false}){
            Surface(
               modifier = Modifier
                  .padding(10.dp)
                  .size(500.dp,600.dp),

               shape = RoundedCornerShape(20.dp)
            ) {
               Column(modifier = Modifier
                  .padding(10.dp)
                  .background(Color.Green, shape = RoundedCornerShape(20.dp))
               , horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.Center
               ) { Text("You have sent $count notification!")
                  // Spacer(Modifier.height(30.dp))
                  Button(onClick = {count++}
                  ) {
                     Text("Send notification")
                  }
               }
//               Spacer(modifier = Modifier.height(40.dp))
//               Massage()
            }
         }
      }
   }
}

//@Preview
//@Composable
//fun Massage(){
//   var count by remember{mutableStateOf(0)}
//   Column(modifier = Modifier
//      .fillMaxSize()
//      , horizontalAlignment = Alignment.CenterHorizontally,
//      verticalArrangement = Arrangement.Center
//   ) {
//               Text("You have sent $count notification!")
//               Button(onClick = {count++}
//               ) {
//                  Text("Send notification")
//               }
//               Spacer(modifier = Modifier.height(20.dp))
//               OutlinedCard(
//                  colors = CardDefaults.cardColors(
//                     contentColor = MaterialTheme.colorScheme.surfaceVariant),
//                  border = BorderStroke(1.dp, Color.Black),
//                  modifier = Modifier.size(150.dp, 40.dp)
//               ){
//                  Row(verticalAlignment = Alignment.CenterVertically) {
//                     Image(
//                        painter = painterResource(id = R.drawable.heart),
//                        contentDescription = " "
//                     )
//                     Text("Massage sent!")
//                  }
//               }
//            }
//         }
//



