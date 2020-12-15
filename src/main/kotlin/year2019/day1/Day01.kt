package year2019.day1

import Puzzle
import util.sumByLong

fun main() {
    println(Day01(2019, 1).solvePartOne())
    println(Day01(2019, 1).solvePartTwo())
}

class Day01(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Long>(year, day, public) {

    override fun readInput() {
        input = rawInput.map { it.toLong() }
    }

    fun solvePartOne(): Long {
        readInput()
        return input.sumByLong { it.getFuelRequirements() }
    }

    fun solvePartTwo(): Long {
        readInput()
        return input.sumByLong { it.getFullFuelRequirements() }
    }
}

fun Long.getFuelRequirements() = this / 3 - 2

fun Long.getFullFuelRequirements(): Long {
    val requirements = getFuelRequirements()
    return if (requirements <= 0) 0 else requirements + requirements.getFullFuelRequirements()
}