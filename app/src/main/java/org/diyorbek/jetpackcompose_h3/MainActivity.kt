package org.diyorbek.jetpackcompose_h3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.diyorbek.jetpackcompose_h3.ui.theme.JetpackComposeH3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeH3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeUi()
                }
            }
        }
    }
}

@Composable
fun HomeUi() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Pill Reminded", fontSize = 30.sp)
        Image(
            painter = painterResource(id = R.drawable.new_pill_2),
            contentDescription = "img1",
            modifier = Modifier
                .height(190.dp)
                .width(190.dp)
        )
        Text(text = "Today Pill", fontSize = 30.sp)

        Row(Modifier.background(Color.Cyan, shape = RoundedCornerShape(15.dp)).height(110.dp).width(300.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.new_circle_pill),
                contentDescription = "img2",
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Column {
                Text(
                    text = "White Tablet",
                    fontSize = 23.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 5.dp),
                    color = Color.White
                )
                Text(
                    text = "Before Breakfast",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                    color = Color.White
                )

            }
            Column(Modifier.padding(start = 5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "img2",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "img3",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 20.dp)
                )
            }


        }
        Row(Modifier.background(Color.Cyan, shape = RoundedCornerShape(15.dp)).height(110.dp).width(300.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.pill_4),
                contentDescription = "img4",
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Column {
                Text(
                    text = "Blur Capsule",
                    fontSize = 23.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 5.dp),
                    color = Color.White
                )
                Text(
                    text = "Before Dinner",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                    color = Color.White
                )

            }
            Column(Modifier.padding(start = 5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "img2",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "img3",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 20.dp)
                )
            }


        }
        Row(Modifier.background(Color.Cyan, shape = RoundedCornerShape(15.dp)).height(110.dp).width(300.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.drop),
                contentDescription = "img4",
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Column {
                Text(
                    text = "Eye Drops",
                    fontSize = 23.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 5.dp),
                    color = Color.White
                )
                Text(
                    text = "Before Bed Time",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                    color = Color.White
                )

            }
            Column(Modifier.padding(start = 5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "img2",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "img3",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(top = 20.dp)
                )
            }


        }

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeUi()
}