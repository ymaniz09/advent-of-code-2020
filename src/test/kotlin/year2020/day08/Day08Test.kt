package year2020.day08

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day08Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(5, Day08(2020, 8, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(1501, Day08(2020, 8).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals(8, Day08(2020, 8, true).solvePartTwo())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(509, Day08(2020, 8).solvePartTwo())
    }
}