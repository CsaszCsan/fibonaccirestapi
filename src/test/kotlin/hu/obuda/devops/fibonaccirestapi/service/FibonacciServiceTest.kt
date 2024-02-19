package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }
    @Test
    fun shouldReturn2WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(2, result)
    }
    @Test
    fun shouldReturn832040WhenCall30() {
        // given

        // when
        val result: Int = underTest.fibonacci(30)
        // then
        Assertions.assertEquals(832040, result)
    }

    // TODO - Test with greater numbers and test edge cases
}