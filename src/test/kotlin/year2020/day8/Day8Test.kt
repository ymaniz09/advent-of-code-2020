package year2020.day8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day8Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(5, Day8(2020, 8, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(1501, Day8(2020, 8).solvePartOne())
    }
}