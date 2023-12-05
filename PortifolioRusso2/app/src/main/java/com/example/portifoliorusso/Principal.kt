package com.example.portifoliorusso

import android.accounts.AuthenticatorDescription
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun Principal(){
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp)

    ) {
        val borderWidth = 4.dp
        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .border(
                    BorderStroke(borderWidth, Color.Black),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 270.dp)
    ) {
        val offset = Offset(5.0f, 10.0f)
        Text(
            text = "Bem-Vindo!\n Sou Russo, prazer.",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontSize = 20.sp,
                shadow = Shadow(
                    color = Color.LightGray,
                    offset = offset,
                    blurRadius = 3f
                )
            )
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 400.dp)
            .size(width = 200.dp, height = 100.dp)
    ) {
        Text(text = "Sou estudante do 5º pêriodo do curso de Ciência da Computação na Universidade Catolica de Pernambuco. Já trabalhei com Java, Python, Javascript, Html, CSS e C/C++ em projetos e atividades proposto pelo curso.\n\n Também, já fiz curso de Computação Operacional(Prepara Cursos, 2014), Banco de dados sql e MongoDB(QA coders, 2022) e de inglês básico(Prepara Cursos, 2016).", textAlign = TextAlign.Center)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ClickableImage(
            painter = painterResource(id = R.drawable.github),
            contentDescription = "GitHub",
            url = "https://github.com/BrunTitoWars",
            onClick = {

            }
        )
    }
}

@Composable
fun ClickableImage(
    painter: Painter,
    contentDescription: String?,
    url: String,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier
            .offset(y = 680.dp)
            .size(55.dp)
            .clickable {
                onClick.invoke()
                openUrl(context, url)
            }

    )
}

@Composable
fun ClickableImage2(
    painter: Painter,
    contentDescription: String?,
    url: String,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier
            .offset(y = 680.dp)
            .offset(x = 40.dp)
            .size(60.dp)
            .clickable {
                onClick.invoke()
                openUrl(context, url)
            }

    )
}
@Composable
fun ClickableImage3(
    painter: Painter,
    contentDescription: String?,
    url: String,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier
            .offset(y = 680.dp)
            .offset(x = 107.dp)
            .size(60.dp)
            .clickable {
                onClick.invoke()
                openUrl(context, url)
            }

    )
}


fun openUrl(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}