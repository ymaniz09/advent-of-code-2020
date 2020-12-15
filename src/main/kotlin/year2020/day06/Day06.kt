package year2020.day06

import Puzzle
import util.readNewLineSeparatedInputText

fun main() {
    println(Day06(2020, 6).solvePartOne())
    println(Day06(2020, 6).solvePartTwo())
}

class Day06(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<List<Set<Char>>>(year, day, public) {
    override fun readInput() {
        input = readNewLineSeparatedInputText(inputFileName).map {
            it.split("\n").filter(String::isNotBlank).map(String::toSet)
        }
    }

    fun solvePartOne(): Int {
        readInput()

        return input.sumBy {
            it.reduce { acc, set -> acc.union(set) }.size
        }
    }

    fun solvePartTwo(): Int {
        readInput()

        return input.sumBy {
            it.reduce { acc, set -> acc.intersect(set) }.size
        }
    }
}