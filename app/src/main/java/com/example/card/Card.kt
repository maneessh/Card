package com.example.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold { innerPadding ->
                    ProfileBody(innerPadding)

                }

        }
    }
}


@Composable
fun ProfileBody(innerPadding : PaddingValues){
    Column (
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.Green)
    ) {
        Row{
        }
        Image(
            painter = painterResource(R.drawable.photo1),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .clip(shape = RoundedCornerShape(100.dp))
        )
        Column {
            Text(
                text = "Card",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Simple and easy to use app")
        }

        Row {
            Card(modifier = Modifier.height(200.dp).weight(1f)
            ){}
            Spacer(modifier = Modifier
                .width(10.dp)
            )
            Card(modifier = Modifier.height(200.dp).weight(1f)
            ){}
        }
        Row {Card(modifier = Modifier.height(200.dp).weight(1f)
        ){}
            Spacer(modifier = Modifier
                .width(10.dp)
            )
            Card(modifier = Modifier.height(200.dp).weight(1f)
            ){}

        }


    }

}


@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}