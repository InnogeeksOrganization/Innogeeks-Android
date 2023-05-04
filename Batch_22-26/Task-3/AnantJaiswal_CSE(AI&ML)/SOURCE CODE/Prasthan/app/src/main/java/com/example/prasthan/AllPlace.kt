package com.example.prasthan

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllPlaces(selectedPlace: (Int)->Unit){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Incredible India", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.headlineMedium)}

            )
        }
    ) {
        val scrollState= rememberScrollState()
        val context= LocalContext.current
        val placeslist: List<Place> =places.getPlaceList(context)
        LazyColumn(modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
        ){
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(top = 50.dp, bottom = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Places to Visit",
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,
                        style = MaterialTheme.typography.headlineLarge
                    )
                }
            }
            items(placeslist){
                place ->
                PlaceCard(place, selectedPlace)
            }
        }
    }
}