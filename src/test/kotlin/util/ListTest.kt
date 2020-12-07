package util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class ListTest {
    @Test
    fun `should return valid pair for two items`() {
        val input = listOf(1, 5)

        val output: MutableList<Pair<Int, Int>> = mutableListOf()
        input.getAllPairs { i1, i2 -> output.add(Pair(i1, i2)) }

        assertEquals(listOf(Pair(1, 5)), output)
    }

    @Test
    fun `should find the missing number when there is a missing number`() {
        val input = listOf(1, 2, 3, 4, 6, 7)
        assertEquals(5, input.findMissingNumber())
    }

    @Test
    fun `should raise exception if there is no missing number`() {
        val input = listOf(1, 2, 3, 4, 5, 6, 7)
        assertThrows(NoSuchElementException::class.java) { input.findMissingNumber() }
    }

    @Test
    fun `should find the missing number when the input is not sorted`() {
        val input = listOf(1, 2, 3, 4, 5, 6, 7, 9, 10).shuffled()
        assertEquals(8, input.findMissingNumber())
    }
}