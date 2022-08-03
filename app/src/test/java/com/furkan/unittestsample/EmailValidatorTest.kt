package com.furkan.unittestsample

import android.util.Patterns.*
import org.junit.Assert.assertEquals
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator(){
        val email = "furkankaymaz@gmail.com"
        assertEquals(true,Validator.validateEmail(email))
    }
}