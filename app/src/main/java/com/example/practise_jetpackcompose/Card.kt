package com.example.practise_jetpackcompose

import android.graphics.Paint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardExample(){
    var select by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            colors = CardDefaults.cardColors(
                contentColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier.
            size(260.dp,150.dp)
        ) {
            Text(
                text = "Filled",
                modifier = Modifier
                    .padding(20.dp),
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
            ElevatedCard (
                colors = CardDefaults.cardColors(
                    contentColor = MaterialTheme.colorScheme.surface
                ),
                modifier = Modifier.size(260.dp,150.dp)
            ){
                Text(
                    text = "ElevateCard",
                    modifier = Modifier
                        .padding(20.dp),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedCard(
//            colors = CardDefaults.cardColors(
//                contentColor = MaterialTheme.colorScheme.surface
//            ),
            modifier = Modifier.size(260.dp,150.dp)
                .clickable(
                    onClick = {}
                ),
            border = BorderStroke(1.dp, color = Color.Black)
        ){
            Text(
                text = "OutlinedCard",
                modifier = Modifier.padding(20.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        OutlinedTextField(
            value = select,
            onValueChange = {select = it},
            label = {Text(text = "+Type here.....")},
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) }

        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardExample(){
    CardExample()
}