package com.example.practise_jetpackcompose

import android.R.attr.contentDescription
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp




@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CarouselMultiBrowse() {

    data class CarouselItem(
        val id: Int,
        @DrawableRes val imager: Int,
        val contentDescription: String)


    val items = remember {
        listOf(
            CarouselItem(0, R.drawable.imge, "image"),
            CarouselItem(1, R.drawable.image2, "image2"),
            CarouselItem(0, R.drawable.imge, "image"),
            CarouselItem(5, R.drawable.image6, "image6"),
            CarouselItem(4, R.drawable.image5, "image5"),
            CarouselItem(2, R.drawable.image3, "image3"),
            CarouselItem(3, R.drawable.image4, "image4"),
            CarouselItem(2, R.drawable.image3, "image3"),
            CarouselItem(6, R.drawable.image7, "image7"),
            CarouselItem(3, R.drawable.image4, "image4"),
            CarouselItem(4, R.drawable.image5, "image5"),
            CarouselItem(5, R.drawable.image6, "image6"),
            CarouselItem(6, R.drawable.image7, "image7"),
            CarouselItem(id = 7,R.drawable.imge8, "image8"),
            CarouselItem(id = 8,R.drawable.image9, "image8"),
            CarouselItem(id = 9,R.drawable.imge8, "image8"),
            CarouselItem(id = 10,R.drawable.image4, "image8"),
            CarouselItem(id = 11,R.drawable.image6, "image8"),
            CarouselItem(0, R.drawable.imge, "image"),
            CarouselItem(1, R.drawable.image2, "image2"),
            CarouselItem(0, R.drawable.imge, "image"),
            CarouselItem(5, R.drawable.image6, "image6"),
        )
    }

    val items2 = listOf(
        CarouselItem(id = 7,R.drawable.imge8, "image8"),
        CarouselItem(id = 8,R.drawable.image9, "image8"),
        CarouselItem(id = 9,R.drawable.imge8, "image8"),
        CarouselItem(id = 10,R.drawable.image4, "image8"),
        CarouselItem(id = 11,R.drawable.image6, "image8"),
        CarouselItem(0, R.drawable.imge, "image"),
        CarouselItem(1, R.drawable.image2, "image2"),
        CarouselItem(0, R.drawable.imge, "image"),
        CarouselItem(5, R.drawable.image6, "image6"),
        CarouselItem(4, R.drawable.image5, "image5"),
        CarouselItem(2, R.drawable.image3, "image3"),
        CarouselItem(3, R.drawable.image4, "image4"),
        CarouselItem(2, R.drawable.image3, "image3"),
        CarouselItem(6, R.drawable.image7, "image7"),
        CarouselItem(3, R.drawable.image4, "image4"),
        CarouselItem(4, R.drawable.image5, "image5"),
        CarouselItem(5, R.drawable.image6, "image6"),
        CarouselItem(6, R.drawable.image7, "image7")
    )

    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Black),
        verticalArrangement = Arrangement.Top
    ) {
        HorizontalMultiBrowseCarousel(
            state = rememberCarouselState { items.count() },

            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp, bottom = 16.dp),
            preferredItemWidth = 186.dp,
            itemSpacing = 8.dp,
            contentPadding = PaddingValues(horizontal = 16.dp)

        ) { i ->
            val item = items[i]
            Image(
                modifier = Modifier
                    .height(205.dp)
                    .maskClip(MaterialTheme.shapes.extraLarge),
                painter = painterResource(id = item.imager),
                contentDescription = item.contentDescription,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(Modifier.height(40.dp))
        HorizontalMultiBrowseCarousel(
            state = rememberCarouselState { items2.count() },

            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp, bottom = 16.dp),
            preferredItemWidth = 186.dp,
            itemSpacing = 8.dp,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) { j ->
            val value = items2[j]
            Image(
                modifier = Modifier
                    .height(300.dp)
                    .maskClip(MaterialTheme.shapes.extraLarge),
                painter = painterResource(id = value.imager),
                contentDescription = value.contentDescription,
                contentScale = ContentScale.Crop
            )

        }
        Spacer(Modifier.height(50.dp))

        HorizontalUncontainedCarousel(
            state = rememberCarouselState { items.count() },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp, bottom = 16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            itemSpacing = 8.dp,

            itemWidth = 150.dp,

        ) { h ->
            val image = items[h]
            Image(
                modifier = Modifier
                    .height(250.dp)
                    .maskClip(MaterialTheme.shapes.extraLarge),
                painter = painterResource(id = image.imager),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

        }

    }
}




