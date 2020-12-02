package day01

import Puzzle
import util.getAllPairs
import util.getAllTriples

fun main() {
    println(Day01(1).solvePartOne())
    println(Day01(1).solvePartTwo())
}

class Day01(
    day: Int,
    public: Boolean = false
) : Puzzle<Int>(day, public) {

    override fun readInput() {
        input = rawInput.map { it.toInt() }
    }

    fun solvePartOne(): Int {
        readInput()
        input.getAllPairs { first, second ->
            if (first + second == 2020) return first * second
        }

        throw IllegalArgumentException("Input is not valid")
    }

    fun solvePartTwo(): Int {
        readInput()
        input.getAllTriples { first, second, third ->
            if (first + second + third == 2020) return first * second * third

        }

        throw IllegalArgumentException("Input is not valid")
    }
}