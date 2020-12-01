package day01

import Puzzle
import util.getAllPairs
import util.getAllTriples

fun main() {
    println(Day01().solve())
    println(Day01().solve2())
}

class Day01: Puzzle() {

    fun solve(): Int {

        getIntList().getAllPairs { first, second ->
            if (first + second == 2020) return first * second
        }

        throw IllegalArgumentException("Input is not valid")
    }

    fun solve2(): Int {
        getIntList().getAllTriples { first, second, third ->
            if (first + second + third == 2020) return first * second * third

        }

        throw IllegalArgumentException("Input is not valid")
    }

    private fun getIntList() = readInput("day01.txt").map { it.toInt() }

}