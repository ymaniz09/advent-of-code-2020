package year2020.day6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day6Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(11, Day6(2020, 6, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(6778, Day6(2020, 6).solvePartOne())
    }
}