package com.example.practise_jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

data class ToggleableInfo(
    val isChecked: Boolean,
    val text: String
    )
@Composable
 fun Checkboxes(){
     val checkbox = remember{mutableStateOf(
     listOf(
                ToggleableInfo(
                   isChecked = false,
                   text = "Photo"
                ),
                ToggleableInfo(
                   isChecked = false,
                   text = "Video"
                ),
                ToggleableInfo(
                   isChecked = false,
                   text = "Audio"
               ),
            )
        )
    }
}