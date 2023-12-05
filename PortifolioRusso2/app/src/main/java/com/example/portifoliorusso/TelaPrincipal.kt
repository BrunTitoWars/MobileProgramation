package com.example.portifoliorusso

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import java.security.Principal

@Composable
fun TelaPrincipal(){

    val selectedItem = rememberSaveable{ mutableStateOf(0) }

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        BottomNavigation(
            backgroundColor = Color.White
        ){
            BottomNavigationItem(
                selected = selectedItem.value == 0,
                onClick = { selectedItem.value = 0 },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_home_24),
                        contentDescription = "Home",
                        tint = if(selectedItem.value == 0) Color.LightGray else Color.Black
                    )
                },
                label = {
                    Text(
                        text = "Home",
                        color = if (selectedItem.value == 0) Color.LightGray else Color.Black
                    )
                }
            )
            BottomNavigationItem(
                selected = selectedItem.value == 1,
                onClick = { selectedItem.value = 1 },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_assignment_24),
                        contentDescription = "Projetos",
                        tint = if(selectedItem.value == 1) Color.LightGray else Color.Black
                    )
                },
                label = {
                    Text(
                        text = "Projetos",
                        color = if (selectedItem.value == 1) Color.LightGray else Color.Black
                    )
                }
            )
            BottomNavigationItem(
                selected = selectedItem.value == 2,
                onClick = { selectedItem.value = 2 },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_account_circle_24),
                        contentDescription = "Contato",
                        tint = if(selectedItem.value == 2) Color.LightGray else Color.Black
                    )
                },
                label = {
                    Text(
                        text = "Contato",
                        color = if (selectedItem.value == 2) Color.LightGray else Color.Black
                    )
                }
            )
        }
    }

    when(selectedItem.value){
        0 -> Principal()
        1 -> TelasProjetos()
        2 -> Tela()
    }

}