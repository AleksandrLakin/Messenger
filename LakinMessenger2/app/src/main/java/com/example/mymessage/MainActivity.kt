package com.example.mymessage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mymessage.app.App
import com.example.mymessage.ui.NavigationDestination
import com.example.mymessage.ui.auth.AuthScreen
import com.example.mymessage.ui.register.RegisterScreen
import com.example.mymessage.ui.theme.MyMessageTheme
import com.example.mymessage.ui.users.UsersScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyMessageTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = NavigationDestination.AuthScreen.destination) {

                        composable(NavigationDestination.AuthScreen.destination) {
                            val viewModel = App.appComponent.getAuthComponent().viewModel()
                            AuthScreen(modifier = Modifier.padding(innerPadding), navController = navController, viewModel = viewModel)
                        }

                        composable(NavigationDestination.RegisterScreen.destination) {
                            val viewModel = App.appComponent.getRegisterComponent().viewModel()
                            RegisterScreen(modifier = Modifier.padding(innerPadding), navController = navController, viewModel = viewModel)
                        }

                        composable(NavigationDestination.UsersScreen.destination) {
                            val viewModel = App.appComponent.getUsersComponent().viewModel()
                            UsersScreen(modifier = Modifier.padding(innerPadding), navController = navController, viewModel = viewModel)
                        }

                    }
                }
            }
        }
    }
}