package util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ListTest {
    @Test
    fun `Should return valid pair for two items`() {
        val input = listOf(1, 5)

        val output: MutableList<Pair<Int, Int>> = mutableListOf()
        input.getAllPairs { i1, i2 -> output.add(Pair(i1, i2)) }

        assertEquals(listOf(Pair(1, 5)), output)
    }
}