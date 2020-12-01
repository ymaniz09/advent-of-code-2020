package util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ListTest {
    @Test
    fun `Should return valid pair for two items`() {
        val input = listOf(1, 5)
        
        input.getAllPairs { i1, i2 ->  }
    }
}