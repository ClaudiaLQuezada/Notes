package com.example.services.ui.theme.composables

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.services.service.MyService


@Composable
fun MainView() {
    var context = LocalContext.current
    var  serviceIntent: Intent = Intent(context, MyService::class.java)

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.padding(16.dp).size(200.dp, 100.dp),
            shape = RoundedCornerShape(16.dp) ,
            onClick = { context.startService(serviceIntent) }) {
             Text("Start Service")
        }
    }

}

@Preview
@Composable
fun MainViewPreview() {
    MainView()
}