package year2020.day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day5Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(820, Day5(2020, 5, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(835, Day5(2020, 5).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(649, Day5(2020, 5).solvePartTwo())
    }
}