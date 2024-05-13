package com.example.tashasapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tashasapplication.ui.theme.TashasApplicationTheme
import kotlin.math.round

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign()
        }
    }
}

@Composable
fun Assign(){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ){
        

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row {               
            
            Image(painter = painterResource(id = R.drawable.paw),
                contentDescription = "",
                modifier = Modifier.size(100.dp))
                
                Spacer(modifier = Modifier.width(20.dp))
                
                androidx.compose.material3.Text(
                    text = "Woof",
                    fontSize = 38.sp,
                    fontFamily = FontFamily.Cursive
                )
            }

        }
          
            

        Spacer(modifier = Modifier.height(20.dp))

        //card 1

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.dogs),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .clip(shape = CircleShape), )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Koda",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "2 years old")
                }

            }
        }

        //end of card 1
        
        
        Spacer(modifier = Modifier.height(2.dp))

        //card 2

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.puppy1),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape), )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Lola",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "16 years old")
                }

            }
        }

        //end of card 2

        Spacer(modifier = Modifier.height(2.dp))

        //card 3

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.puppy2),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape), )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Frankie",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "2 years old")
                }

            }
        }

        //end of card 3

        Spacer(modifier = Modifier.height(2.dp))

        //card 4

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.puppy3),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape), )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Nox",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "8 years old")
                }

            }
        }

        //end of card 4

        Spacer(modifier = Modifier.height(2.dp))

        //card 5

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.dg1),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape),
                    )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Faye",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "8 years old")
                }

            }
        }

        //end of card 5

        Spacer(modifier = Modifier.height(2.dp))

        //card 6

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.dg2),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape),
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Bella",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "14 years old")
                }

            }
        }

        //end of card 6

        Spacer(modifier = Modifier.height(2.dp))

        //card 7

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.dg3),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape),
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Moana",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "2 years old")
                }

            }
        }

        //end of card 7

        Spacer(modifier = Modifier.height(2.dp))

        //card 8

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(10.dp)
        ) {

            Row {
                Image(painter = painterResource(id = R.drawable.dg4),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .width(60.dp)
                        .clip(shape = CircleShape),
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Tzeitel",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    androidx.compose.material3.Text(text = "7 years old")
                }

            }
        }

        //end of card 8





    }
        
       

            
        }





@Preview(showBackground = true)
@Composable
fun AssignPreview(){
    Assign()
}