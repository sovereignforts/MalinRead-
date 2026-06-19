package com.sovereignforts.malinread

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MalinReadHome()
        }
    }
}

@Composable
fun MalinReadHome() {

    val books = listOf(
        "Mathematics for ML",
        "Essential Math",
        "Deep Learning",
        "Aircraft Structures"
    )

    MaterialTheme {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(16.dp)
        ) {

            item {

                Text(
                    text = "MalinRead",
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )

                Spacer(
                    modifier = Modifier.height(24.dp)
                )

                Text(
                    text = "TODAY",
                    color = Color.Gray,
                    fontSize = 14.sp
                )

                Text(
                    text = "4h 23m",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(24.dp)
                )
            }

            items(books) { book ->

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                ) {

                    Text(
                        text = book,
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Read 1h 12m",
                        color = Color.Gray
                    )

                }

            }

        }

    }

}