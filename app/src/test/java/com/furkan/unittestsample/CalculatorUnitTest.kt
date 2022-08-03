package com.furkan.unittestsample

import org.junit.Assert.*
import org.junit.Test

class CalculatorUnitTest {
    @Test
    fun addTest(){
        val calculator = Calculator()
        val result = calculator.add(15,5)
        assertEquals(20,result)
    }


    @Test
    fun subtractTest(){
        val calculator = Calculator()
        val result = calculator.subtract(15,5)
        assertEquals(10,result)
    }

    @Test
    fun multiplyTest(){
        val calculator = Calculator()
        val result = calculator.multiply(15,5)
        assertEquals(75,result)
    }
    @Test
    fun divideTest(){
        val calculator = Calculator()
        val result = calculator.divide(45,5)
        assertEquals(9,result)
    }

    @Test
    fun equalTest(){
        val result = Calculator().isItEqual(5,5)
        assertEquals(true,result)

    }

    @Test
    fun isItEvenNumber(){
        assertEquals("Bu bir tek sayıdır",true,Calculator().isItEvenNumber(5))
    }

}