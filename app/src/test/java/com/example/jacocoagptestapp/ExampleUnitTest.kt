package com.example.jacocoagptestapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `jacoco test coverage`() {
        val registerFragment = RegisterFragment()

        val result = registerFragment.doSomethingElse()

        assertEquals(1337, result)
    }
}
