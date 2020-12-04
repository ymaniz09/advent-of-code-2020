package year2019.day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day1Test {
    @Test
    fun `should solve the part one for the problem public input`() {
        assertEquals((2 + 2 + 654 + 33583), Day1(2019, 1, true).solvePartOne())
    }

    @Test
    fun `should solve the part one for the problem input`() {
        assertEquals(3347838, Day1(2019, 1).solvePartOne())
    }

    @Test
    fun `should solve the part two for the problem public input`() {
        assertEquals(2 + 2 + 966 + 50346, Day1(2019, 1, true).solvePartTwo())
    }

    @Test
    fun `should solve the part two for the problem input`() {
        assertEquals(5018888, Day1(2019, 1).solvePartTwo())
    }

    @Test
    fun `should calculate fuel requirements for multiples of 3`() {
        assertEquals(2, 12L.getFuelRequirements())
    }

    @Test
    fun `should calculate fuel requirements for remainder 1 when divided by 3`() {
        assertEquals(1, 10L.getFuelRequirements())
    }

    @Test
    fun `should calculate fuel requirements for remainder 2 when divided by 3`() {
        assertEquals(1, 11L.getFuelRequirements())
    }

    @Test
    fun `should calculate full fuel requirements for first problem input`() {
        assertEquals(2, 14L.getFullFuelRequirements())
    }

    @Test
    fun `should calculate full fuel requirements for second problem input`() {
        assertEquals(966, 1969L.getFullFuelRequirements())
    }

    @Test
    fun `should calculate full fuel requirements for third problem input`() {
        assertEquals(50346, 100756L.getFullFuelRequirements())
    }
}