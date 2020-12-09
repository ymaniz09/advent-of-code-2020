package year2020.day8

import Puzzle
import util.readRawInput

fun main() {
    println(Day8(2020, 8).solvePartOne())
    println(Day8(2020, 8).solvePartTwo())
}

class Day8(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Instruction>(year, day, public) {
    override fun readInput() {
        input = readRawInput(inputFileName).map {
            val (op, value) = it.split(' ')
            Instruction(Operation.valueOf(op.toUpperCase()), value.toInt())
        }
    }

    fun solvePartOne(): Int {
        readInput()

        return Program(input).runUntilFirstLoop()
    }

    fun solvePartTwo(): Int {
        TODO("Not yet implemented")
    }
}