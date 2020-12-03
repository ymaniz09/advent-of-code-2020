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

    fun solvePartOne(): Int {
        readInput()
        val height = input.size
        val width = input.first().length
        var trees = 0

        var x = 0
        var y = 0

        while (y < height) {
            if (input[y][x] == '#')
                trees++

            x = (x + 3) % width
            y += 1

        }

        return trees
    }

    fun solvePartTwo(): Int {
        readInput()
        return 0
    }
}