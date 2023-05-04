package com.example.prasthan

import android.content.Intent
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.prasthan.screens.PlaceScreen
import com.example.prasthan.screens.SplashScreen
import com.example.prasthan.ui.theme.PrasthanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrasthanTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    UserApplication()
                }
            }
        }
    }
}
const val USER_ID_KEY="id"
const val Splash = "Splash"
@Composable
fun UserApplication(startDestination: String = "splash_screen"){
    val navController= rememberNavController()
    val actions=remember(navController){AppActions(navController)}
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable(route = "splash_screen"){
            SplashScreen(navController=navController)
        }
        composable(route = "Home"){
            AllPlaces(selectedPlace = actions.selectedPlace)
        }
        composable(route="userDetails/{$USER_ID_KEY}", arguments= listOf(navArgument(USER_ID_KEY){
            type= NavType.IntType
        })
        ){
            backStackEntry->val arguments= requireNotNull(backStackEntry.arguments)
            PlaceScreen(Placeid = arguments.getInt(USER_ID_KEY), navigateUp=actions.navigateUp)
        }
    }

}
private class AppActions(
    navController: NavHostController
){
    val selectedPlace:(Int)->Unit={
        PlaceId: Int->navController.navigate("userDetails/$PlaceId")
    }
    val navigateUp:()->Unit ={
        navController.navigateUp()
    }
}

@Composable
fun BottomNav(navController: NavHostController){
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){

        }
        composable("Destination")
        {

        }
        composable("Experiences"){

        }
        composable("About India"){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrasthanTheme {

    }
}