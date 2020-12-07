package year2020.day5

import Puzzle
import util.findMissingNumber

fun main() {
    println(Day5(2020, 5).solvePartOne())
    println(Day5(2020, 5).solvePartTwo())
}

class Day5(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<String>(year, day, public) {
    override fun readInput() {
        input = rawInput
    }

    fun solvePartOne(): Int {
        readInput()
        return input.map {
            SeatDecoder.getDecimalSeatPosition(it)
        }.toList().maxOrNull() ?: throw IllegalArgumentException("Input is not valid")
    }

    fun solvePartTwo(): Int {
        readInput()

        return input.map {
            SeatDecoder.getDecimalSeatPosition(it)
        }.toList().findMissingNumber()
    }
}