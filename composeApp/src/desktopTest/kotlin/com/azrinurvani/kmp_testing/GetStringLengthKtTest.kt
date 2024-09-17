package com.azrinurvani.kmp_testing

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test


class GetStringLengthKtTest{

    @Test
    fun testGetStringLength(){
        assertThat(getStringLength("ABC")).isEqualTo(3)
    }

}