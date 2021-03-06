package year2020.day03

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day03Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(7, Day03(2020, 3, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(162, Day03(2020, 3).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals(336, Day03(2020, 3, true).solvePartTwo())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(3064612320, Day03(2020, 3).solvePartTwo())
    }
}