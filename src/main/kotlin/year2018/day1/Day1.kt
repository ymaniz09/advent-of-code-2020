package year2018.day1

import Puzzle
import util.asInfinite

fun main() {
    println(Day1(2018, 1).solvePartOne())
    println(Day1(2018, 1).solvePartTwo())
}

class Day1(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Int>(year, day, public) {

    override fun readInput() {
        input = rawInput.map { it.toInt() }
    }

    fun solvePartOne(): Int {
        readInput()
        return input.sum()
    }

    fun solvePartTwo(): Int {
        readInput()
        val set = HashSet<Int>()
        var amount = 0

        input.asSequence().asInfinite().forEach {
            amount += it
            if (set.contains(amount)) {
                return amount
            } else {
                set.add(amount)
            }
        }

        return amount
    }
}
