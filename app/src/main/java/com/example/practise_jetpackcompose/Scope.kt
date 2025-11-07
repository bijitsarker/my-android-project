package com.example.practise_jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun RememberCoroutineScope(){
    val scope = rememberCoroutineScope()
    Column (modifier = Modifier.fillMaxSize()
    , horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){ Button(onClick = {
        scope.launch {
            delay(1000L)
            println("Hello world!")
        }
    }) { } }

}