package com.example.practise_jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Menus(){
    var expanded by remember { mutableStateOf((false)) }
    Box(Modifier.padding(25.dp))
    {
        IconButton(
            onClick = { expanded = !expanded }
        ){
            Icon(imageVector = Icons.Default.MoreVert,
                contentDescription = "MoreVert")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false },

        ){
            DropdownMenuItem(
               text = { Text("Setting") },
                leadingIcon = {Icon(Icons.Default.Settings, null)},
                onClick = {},
            )
            DropdownMenuItem(
                text = {Text("Profile")},
                leadingIcon = {Icon(Icons.Default.Person, null)},
                onClick = {}
            )
            DropdownMenuItem(
                text = {Text("Send Facebook")},
                leadingIcon = {Icon(Icons.Default.AccountBox, contentDescription = null)},
                trailingIcon = {Icon(Icons.Default.Send, contentDescription = null)},
                onClick = {}
            )
            DropdownMenuItem(
                text = {Text("About")},
                leadingIcon = {Icon(Icons.Default.Info, contentDescription = null)},
                onClick = {}
            )
            DropdownMenuItem(
                text = {Text("Share   ")},
                leadingIcon = {Icon(Icons.Default.Share, contentDescription = null)},
                trailingIcon = {Icon(Icons.Default.Done, contentDescription = null)},
                onClick = {}
            )
        }
    }
}