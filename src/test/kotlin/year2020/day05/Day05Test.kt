package year2020.day05

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day05Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(820, Day05(2020, 5, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(835, Day05(2020, 5).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(649, Day05(2020, 5).solvePartTwo())
    }
}