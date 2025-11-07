package com.example.practise_jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, heightDp = 500, widthDp = 300)
@Composable
fun MyScreen(){
    Card( //elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
        ){
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = " "
            )
        }
    }
}