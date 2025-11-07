package com.example.practise_jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.ContentType
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun CreateImage(){
    Box(Modifier.fillMaxSize()
        .background(Color.Black),
        Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = " ",
                colorFilter = ColorFilter.tint(color = Color.Blue),
                modifier = Modifier.size(300.dp),

                contentScale = ContentScale.Crop,

            )
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Heart",
            fontWeight = FontWeight.Bold
        )
    }

}