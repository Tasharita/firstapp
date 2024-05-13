package com.example.tashasapplication

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tashasapplication.ui.theme.TashasApplicationTheme

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {


    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.blue), contentScale = ContentScale.FillBounds)) {

        val mContext = LocalContext.current

        //Topappbar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "This icon is a menu",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "",
                        tint = Color.White
                    )
                }


            })
        //END OF TOPAPPBAR

        Spacer(modifier = Modifier.height(5.dp))

        androidx.compose.material3.Text(text = "BREED OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        //row 1
        Row {
            Image(painter = painterResource(id = R.drawable.puppy1),
                contentDescription ="" ,
                modifier = Modifier.size(width = 200.dp, height = 100.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "Bulldog",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "Bulldog is an amazing dog.")
            }
        }

        Spacer(modifier = Modifier.height(5.dp))
        //row 3
        Row {
            Image(painter = painterResource(id = R.drawable.puppy2),
                contentDescription ="" ,
                modifier = Modifier.size(width = 200.dp, height = 100.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "German Shepherd",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "This is a fierce dog.")
            }
        }

        Spacer(modifier = Modifier.height(5.dp))
        //row 4
        Row {
            Image(painter = painterResource(id = R.drawable.puppy3),
                contentDescription ="" ,
                modifier = Modifier.size(width = 200.dp, height = 100.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "Chihuahua",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "This is a small dog.")
            }
        }

        Spacer(modifier = Modifier.height(5.dp))
        //row 5
        Row {
            Image(painter = painterResource(id = R.drawable.dogs),
                contentDescription ="" ,
                modifier = Modifier.size(width = 200.dp, height =100.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "Japanese Spitz",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "This a playful dog.")
            }
        }

        Row {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),)
            {
                androidx.compose.material3.Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = Color.White)
                androidx.compose.material3.Text(text = "Back")
            }
            Spacer(modifier = Modifier.width(40.dp))

            Button(onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),) {
                androidx.compose.material3.Text(text = "Next")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}
