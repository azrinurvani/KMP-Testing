package com.azrinurvani.kmp_testing

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Counter(modifier: Modifier = Modifier){
    var count by remember { mutableIntStateOf(0) }

    Column {
        Text(count.toString())
        Button(onClick = { count++ }){
            Text("Increment")
        }
    }
}