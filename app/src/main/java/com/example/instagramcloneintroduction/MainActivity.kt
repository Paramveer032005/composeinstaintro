package com.example.instagramcloneintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Introduction()

        }
    }
}
@Composable
fun Introduction() {
    Card(elevation = 20.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(all = 25.dp)) {
            Text(text = "Introduction to Instagram Clone",fontWeight = FontWeight.Bold


            )

            Text(text = "About this app : Instagram Clone brings you closer to the people and things you love. Connect with friends, see photos of what they are up to,\n" +
                    "* Search your favourite actors and new people,\n" +
                    "* Watch post and more from your favorite pages\n" +
                    "* Get inspired by photos from new accounts in Explore\n" +
                    "* Discover brands and small businesses, and shop products that are relevant to your personal style\n"
            )
            Text(text = "About this app : Instagram Clone brings you closer to the people and things you love. Connect with friends, see photos of what they are up to,\n" +
                    "* Search your favourite actors and new people,\n" +
                    "* Watch post and more from your favorite pages\n" +
                    "* Get inspired by photos from new accounts in Explore\n" +
                    "* Discover brands and small businesses, and shop products that are relevant to your personal style\n")
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Column() {
                    Image(painter = painterResource(id = R.drawable.img), modifier = Modifier.size(190.dp), contentDescription = null )
                    Text(text = "Before",fontWeight = FontWeight.Bold)
                }
                Column() {
                    Image(painter = painterResource(id = R.drawable.img_1),modifier = Modifier.size(200.dp), contentDescription = null )
                    Text(text = "After",fontWeight = FontWeight.Bold)
                }

            }


            Text(text = "Functionalities and Concepts used : \n" +
                    "Required os : Android 5.0 and up, scrollable feature in both stories and posts with working navigation icons and a search feature with history \n")

            Text(text = "Application Link :")
        }
    }



}
