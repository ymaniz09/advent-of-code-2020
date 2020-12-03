package year2020.day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day1Test {
    @Test
    fun testPuzzle1() {
        assertEquals(1003971, Day1(2020, 1).solvePartOne())
    }

    @Test
    fun testPuzzle2() {
        assertEquals(84035952, Day1(2020, 1).solvePartTwo())
    }
}