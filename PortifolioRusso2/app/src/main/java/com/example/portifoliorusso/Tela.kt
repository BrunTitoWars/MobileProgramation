package com.example.portifoliorusso

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tela(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 15.dp)
            .offset(x = 15.dp),
    ){
        val context = LocalContext.current
        Card(
            modifier = Modifier
                .width(380.dp)
                .height(90.dp)
                .clickable {
                    openUrl(
                        context,
                        "https://api.whatsapp.com/send?phone=5581988541195"
                    )
                },
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ){

            Text(
                text = "(81)99432-9674",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(y = 22.dp)
                    .offset(x = 120.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.whats),
                contentDescription = "Whatsaap",
                modifier = Modifier
                    .offset(y = -20.dp)
                    .offset(x = 35.dp)
            )

        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 120.dp)
            .offset(x = 15.dp),
    ){
        val context = LocalContext.current
        Card(
            modifier = Modifier
                .width(380.dp)
                .height(90.dp)
                .clickable {
                    openUrl(
                        context,
                        "https://api.whatsapp.com/send?phone=5581988541195"
                    )
                },
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ){

            Text(
                text = "BrunTitoWars",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(y = 22.dp)
                    .offset(x = 120.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.github),
                contentDescription = "Github",
                modifier = Modifier
                    .offset(y = -20.dp)
                    .offset(x = 35.dp)
            )

        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 225.dp)
            .offset(x = 15.dp),
    ){
        val context = LocalContext.current
        Card(
            modifier = Modifier
                .width(380.dp)
                .height(90.dp)
                .clickable {
                    openUrl(
                        context,
                        "https://api.whatsapp.com/send?phone=5581988541195"
                    )
                },
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ){

            Text(
                text = "@brunotw2",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(y = 22.dp)
                    .offset(x = 120.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Instagram",
                modifier = Modifier
                    .offset(y = -20.dp)
                    .offset(x = 18.dp)
            )

        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 435.dp)
            .offset(x = 15.dp),
    ){
        val context = LocalContext.current
        Card(
            modifier = Modifier
                .width(380.dp)
                .height(90.dp)
                .clickable {
                    openUrl(
                        context,
                        "mailto:joao.00000829616@unicap.br"
                    )
                },
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ){

            Text(
                text = "joao.00000829616@unicap.br",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(y = 30.dp)
                    .offset(x = 80.dp)


            )

            Image(
                painter = painterResource(id = R.drawable.gmail),
                contentDescription = "gmail",
                modifier = Modifier
                    .offset(y = -1.dp)
                    .offset(x = 30.dp)
                    .size(40.dp)
            )

            }
        }
}