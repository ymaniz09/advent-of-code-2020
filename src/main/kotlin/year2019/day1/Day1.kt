package year2019.day1

import Puzzle

fun main() {
    println(Day1(2019, 1).solvePartOne())
    println(Day1(2019, 1).solvePartTwo())
}

class Day1(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Int>(year, day, public) {

    override fun readInput() {
        input = rawInput.map { it.toInt() }
    }

    fun solvePartOne(): Long {
        readInput()
        return input.map { ((it / 3) - 2).toLong()  }.sum()
    }

    fun solvePartTwo(): Long {
        readInput()


        return 0
    }
}