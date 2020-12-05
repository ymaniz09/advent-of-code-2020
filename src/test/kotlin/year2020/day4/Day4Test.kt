package year2020.day4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day4Test {
    @Test
    fun `should read the input properly the first entry`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val firstEntry: Map<String, String> = mapOf(
            "ecl" to "gry",
            "pid" to "860033327",
            "eyr" to "2020",
            "hcl" to "#fffffd",
            "byr" to "1937",
            "iyr" to "2017",
            "cid" to "147",
            "hgt" to "183cm"
        )

        assertEquals(firstEntry, puzzle.input.first())
    }

    @Test
    fun `first passport should be valid`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val firstEntry = puzzle.input.first()

        assertTrue(puzzle.isValid(firstEntry))
    }

    @Test
    fun `should read the input properly the second entry`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val secondEntry: Map<String, String> = mapOf(
            "iyr" to "2013",
            "ecl" to "amb",
            "cid" to "350",
            "eyr" to "2023",
            "pid" to "028048884",
            "hcl" to "#cfa07d",
            "byr" to "1929"
        )

        assertEquals(secondEntry, puzzle.input[1])
    }

    @Test
    fun `second passport should not be valid`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val secondEntry = puzzle.input[1]

        assertFalse(puzzle.isValid(secondEntry))
    }

    @Test
    fun `should read the input properly the third entry`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val thirdEntry: Map<String, String> = mapOf(
            "hcl" to "#ae17e1",
            "iyr" to "2013",
            "eyr" to "2024",
            "ecl" to "brn",
            "pid" to "760753108",
            "byr" to "1931",
            "hgt" to "179cm"
        )

        assertEquals(thirdEntry, puzzle.input[2])
    }

    @Test
    fun `third passport should not be valid`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val thirdEntry = puzzle.input[2]

        assertTrue(puzzle.isValid(thirdEntry))
    }

    @Test
    fun `should read the input properly the last entry`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val lastEntry: Map<String, String> = mapOf(
            "hcl" to "#cfa07d",
            "eyr" to "2025",
            "pid" to "166559648",
            "iyr" to "2011",
            "ecl" to "brn",
            "hgt" to "59in"
        )

        assertEquals(lastEntry, puzzle.input.last())
    }

    @Test
    fun `fourth passport should not be valid`() {
        val puzzle = Day4(2020, 4, true)
        puzzle.readInput()

        val lastEntry = puzzle.input.last()

        assertFalse(puzzle.isValid(lastEntry))
    }

    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals(2, Day4(2020, 4, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(190, Day4(2020, 4).solvePartOne())
    }
}