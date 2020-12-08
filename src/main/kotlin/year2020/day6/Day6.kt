package year2020.day6

import Puzzle
import util.readNewLineSeparatedInputText

fun main() {
    println(Day6(2020, 6).solvePartOne())
    println(Day6(2020, 6).solvePartTwo())
}

class Day6(
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
        TODO("Not yet implemented")
    }
}