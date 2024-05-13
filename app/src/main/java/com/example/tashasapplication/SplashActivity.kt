package com.example.tashasapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.tashasapplication.ui.theme.TashasApplicationTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(2000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
            }


        }
    }
}

@Composable
fun Splash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.blue), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        )
     {

         Box (modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center){

             //Lottie Animation
             val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.car))
             val progress by animateLottieCompositionAsState(composition)
             LottieAnimation(composition, progress,
                 modifier = Modifier.size(300.dp)
             )

         }

         androidx.compose.material3.Text(
             text = "Welcome to CarGames",
             fontSize = 40.sp,
             fontFamily = FontFamily.Cursive)
         
         Spacer(modifier = Modifier.height(30.dp))

         Box(modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center,) {
             Image(painter = painterResource(id = R.drawable.loading) ,
                 contentDescription = "",
                 modifier = Modifier
                     .size(100.dp),
                 contentScale = ContentScale.Crop)
         }


    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    Splash()
}