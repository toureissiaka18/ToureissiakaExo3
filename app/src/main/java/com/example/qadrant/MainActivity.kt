package com.example.qadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qadrant.ui.theme.QadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        //premiere ligne
        Row(
            modifier = Modifier.weight(1f)
        ){
            //premier cadrant
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(R.string.text1),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.text2),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }

            //deuxieme cadrant
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(R.string.text3),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
                Text(
                    text = stringResource(R.string.text4),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
        //deuxieme ligne
        Row(
            modifier = Modifier.weight(1f)
        ){
            //premier cadrant
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(R.string.text5),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
                Text(
                    text = stringResource(R.string.text6),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }

            //deuxieme cadrant

            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(R.string.text7),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
                Text(
                    text = stringResource(R.string.text8),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    QadrantTheme {
        MyApp()
    }
}