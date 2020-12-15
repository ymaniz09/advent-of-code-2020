package year2020.day05

import Puzzle
import util.findMissingNumber

fun main() {
    println(Day05(2020, 5).solvePartOne())
    println(Day05(2020, 5).solvePartTwo())
}

class Day05(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Int>(year, day, public) {
    override fun readInput() {
        input = rawInput.map { SeatDecoder.getDecimalSeatPosition(it) }
    }

    fun solvePartOne(): Int {
        readInput()
        return input.maxOrNull() ?: throw IllegalArgumentException("Input is not valid")
    }

    fun solvePartTwo(): Int {
        readInput()
        return input.findMissingNumber()
    }
}