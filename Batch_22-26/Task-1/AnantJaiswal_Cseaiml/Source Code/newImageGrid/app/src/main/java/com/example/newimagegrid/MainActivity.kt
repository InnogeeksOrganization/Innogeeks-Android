package com.example.newimagegrid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newimagegrid.ui.theme.NewImageGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewImageGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SampleGridViewScreen()
                }
            }
        }
    }
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SampleGridViewScreen(){
    val items = listOf<BasicGridViewModel>(
        BasicGridViewModel("gallary 1", 10,R.drawable._003venusaur),
    BasicGridViewModel("gallary 1", 10,R.drawable._006charizard),
    BasicGridViewModel("gallary 1", 10,R.drawable._009blastoise),
        BasicGridViewModel("gallary 1", 10,R.drawable._094gengar),
        BasicGridViewModel("gallary 1", 10,R.drawable._065alakazam),
        BasicGridViewModel("gallary 1", 10,R.drawable._115kangaskhan),
        BasicGridViewModel("gallary 1", 10,R.drawable._127pinsir),
        BasicGridViewModel("gallary 1", 10,R.drawable._130gyarados),
        BasicGridViewModel("gallary 1", 10,R.drawable._142aerodactyl),
        BasicGridViewModel("gallary 1", 10,R.drawable._150mewtwo)
    )
    Scaffold() {
        LazyVerticalGrid(columns = GridCells.Fixed(2)){
            items(items.size){
                Image(painter = painterResource(id = items[it].image), contentDescription = null)
            }
        }
    }
}
data class BasicGridViewModel(
    val name: String,
    val count: Int,
    val image: Int
){

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewImageGridTheme {
        SampleGridViewScreen()

    }
}