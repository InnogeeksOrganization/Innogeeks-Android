package com.example.prasthan.screens

import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prasthan.R
import com.example.prasthan.Splash
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController)= Box(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
){
    val scale = remember{
        androidx.compose.animation.core.Animatable(0.0f)
    }
    LaunchedEffect(key1 = true){
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(800,
            easing = {
                OvershootInterpolator(4f).getInterpolation(it)
            })
        )
        delay(1000)
        navController.navigate("Home"){
            popUpTo("splash_screen"){
                inclusive=true
            }
        }
    }
    Image(painter = painterResource(id = R.drawable.flag_of_india_map_wikipedia_india_bebc9613418037dd062cd4e444d96c1d),
        contentDescription = null,
        alignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp)
    )
}