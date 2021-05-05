package com.codewithsandy.basicsjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codewithsandy.basicsjc.ui.theme.BasicsJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }
}

@Composable
fun NewStory()
{
    Column(
        modifier= Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.jcimage),
            contentDescription = null,
            modifier=Modifier.height(180.dp).fillMaxWidth(),
            contentScale= ContentScale.Crop
        )
        Spacer(Modifier.height(18.dp))

        Text("Sun hide behind the rocks!")
        Text("Evenin' reflection falls on he muddy sand!")
        Text("pleasent wind blows!")
    }
}

@Preview
@Composable
fun DefaultPreview()
{
    NewStory()
}