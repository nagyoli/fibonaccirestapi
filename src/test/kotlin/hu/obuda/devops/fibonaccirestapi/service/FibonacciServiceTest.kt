package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall2(){
        // given
        val input: Int = 2
        // when
        val result: Int = underTest.fibonacci(input)
        // then
        Assertions.assertEquals(1, result)
    }


    @Test
    fun shouldReturn8WhenCall6(){
        // given
        val input: Int = 6
        // when
        val result: Int = underTest.fibonacci(input)
        // then
        Assertions.assertEquals(8, result)
    }
}