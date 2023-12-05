package com.example.portifoliorusso

import android.content.Context
import android.content.Intent
import android.net.Uri
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun TelasProjetos(){

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
                .height(220.dp)
                .clickable {
                    openUrl(
                        context,
                        "https://pwm-2023-2-projeto-site.vercel.app"
                    )
                },
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ){
            Text(
                text = "RouteWise",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = 65.dp)
                    .offset(y = 90.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.html),
                contentDescription = "HTML",
                modifier = Modifier
                    .size(40.dp)
                    .offset(y = 85.dp)
                    .offset(x = 15.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.css),
                contentDescription = "CSS",
                modifier = Modifier
                    .size(40.dp)
                    .offset(y = 45.dp)
                    .offset(x = 50.dp)
            )

        }
    }
}