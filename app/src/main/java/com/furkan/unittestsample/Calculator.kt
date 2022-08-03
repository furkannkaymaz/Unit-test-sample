package com.furkan.unittestsample

import android.text.TextUtils
import java.util.regex.Matcher
import java.util.regex.Pattern

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun isItEqual(value1 :Int,value2: Int) : Boolean{
       return value1 == value2
    }

    fun isItEvenNumber(value1 :Int) : Boolean{
     return value1 / 2 == 0
    }


}

