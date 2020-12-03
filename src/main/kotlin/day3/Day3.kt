package day3

import Puzzle

fun main() {
    println(Day3(3).solvePartOne())
    println(Day3(3).solvePartTwo())
}

class Day3(
    day: Int,
    public: Boolean = false
) : Puzzle<String>(day, public) {

    override fun readInput() {
        input = rawInput
    }

    fun solvePartOne(): Long {
        readInput()
        return stepSlopeDown(3, 1)
    }

    fun solvePartTwo(): Long {
        readInput()
        val slopes = listOf(
            1 to 1,
            3 to 1,
            5 to 1,
            7 to 1,
            1 to 2
        )

        return slopes.map {
            stepSlopeDown(it.first, it.second)
        }.reduce(Long::times)
    }

    private fun stepSlopeDown(toRight: Int, toBottom: Int): Long {
        val height = input.size
        val width = input.first().length
        var trees = 0L

        var x = 0
        var y = 0

        while (y < height) {
            if (input[y][x] == '#')
                trees++

            x = (x + toRight) % width
            y += toBottom
        }

        return trees
    }
}