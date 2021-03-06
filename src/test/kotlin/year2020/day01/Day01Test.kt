package year2020.day01

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day01Test {
    @Test
    fun testPuzzle1() {
        assertEquals(1003971, Day01(2020, 1).solvePartOne())
    }

    @Test
    fun testPuzzle2() {
        assertEquals(84035952, Day01(2020, 1).solvePartTwo())
    }
}