package ru.yandex.practicum.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    JetpackTextShowcase()
                }
            }
        }
    }
}

@Composable
fun JetpackTextShowcase() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(R.string.jetpack_text),
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(
                color = Color.Green,
                fontSize = 16.sp,
                fontStyle = FontStyle.Italic
            ),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.jetpack_text),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.jetpack_text),
            style = TextStyle(
                color = Color.Black,
                background = Color.Green,
                fontSize = 24.sp,
                textIndent = TextIndent(48.sp)
            ),
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextPreview() {
    MaterialTheme {
        JetpackTextShowcase()
    }
}
