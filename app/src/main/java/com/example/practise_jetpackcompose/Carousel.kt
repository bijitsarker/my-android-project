package com.example.practise_jetpackcompose

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun Carousel(){
    val text = listOf("Lion", "Tiger", "Dear", "Duck")
    val pagerState = rememberPagerState(pageCount = {text.size})
    HorizontalPager(
        state = pagerState
    ) {index ->
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text("$text")
        }
    }
}