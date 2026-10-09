package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen(modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_composable_desc),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f).fillMaxSize()
            )
            Quadrant(
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.image_composable_desc),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f).fillMaxSize()
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_composable_desc),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f).fillMaxSize()
            )
            Quadrant(
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_composable_desc),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f).fillMaxSize()
            )
        }
    }
}

@Composable
fun Quadrant(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.background(backgroundColor).padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Justify,
            fontSize = 13.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        QuadrantScreen(modifier = Modifier.padding(16.dp))
    }
}