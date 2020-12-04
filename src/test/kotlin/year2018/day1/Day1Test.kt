package year2018.day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day1Test {
    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(595, Day1(2018, 1).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(80598, Day1(2018, 1).solvePartTwo())
    }
}