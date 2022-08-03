package com.furkan.unittestsample

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