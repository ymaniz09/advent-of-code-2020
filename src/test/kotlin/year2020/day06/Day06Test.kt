package year2020.day06

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day06Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(11, Day06(2020, 6, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(6778, Day06(2020, 6).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals(6, Day06(2020, 6, true).solvePartTwo())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(3406, Day06(2020, 6).solvePartTwo())
    }
}