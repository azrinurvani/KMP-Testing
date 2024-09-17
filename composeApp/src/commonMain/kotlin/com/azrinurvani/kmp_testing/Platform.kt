package com.azrinurvani.kmp_testing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform