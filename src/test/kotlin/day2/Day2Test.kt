package day2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day2Test {
    @Test
    fun `should parse the input file correctly`() {
        val puzzle = Day2(2)
        puzzle.readInput()

        val firstPassword = Password(1, 9, "xwjgxtmrzxzmkx", 'x')
        val lastPassword = Password(4, 8, "dndfcnhd", 'd')
        assertEquals(firstPassword, puzzle.input.first())
        assertEquals(lastPassword, puzzle.input.last())
    }

    @Test
    fun `should solve the puzzle for the problem public input`() {
        assertEquals(2, Day2(2, true).solvePartOne())
    }

    @Test
    fun `should solve the puzzle for the problem input`() {
        assertEquals(640, Day2(2).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals(1, Day2(2, true).solvePartTwo())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(472, Day2(2).solvePartTwo())
    }
}