package year2019.day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day1Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals((2 + 2 + 654 + 33583), Day1(2019, 1, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(3347838, Day1(2019, 1).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals((2 + 2 + 654 + 33583), Day1(2019, 1, true).solvePartTwo())
    }
}