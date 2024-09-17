package com.azrinurvani.kmp_testing

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Testing",
    ) {
        App()
    }
}