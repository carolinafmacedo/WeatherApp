package com.example.weatherapp.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable // em caso de erro
sealed interface Route {
    val route: String
    @Serializable
    data object Home : Route{
        override val route = "home"
    }
    @Serializable
    data object List : Route{
        override val route = "list"
    }
    @Serializable
    data object Map : Route{
        override val route = "map"
    }
}
sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: Route)
{
    data object HomeButton :
        BottomNavItem("Início", Icons.Default.Home, Route.Home)
    data object ListButton :
        BottomNavItem("Favoritos", Icons.Default.Favorite, Route.List)
    data object MapButton  :
        BottomNavItem("Mapa", Icons.Default.LocationOn, Route.Map)
}