package year2020.day08

import Puzzle
import util.readRawInput

fun main() {
    println(Day08(2020, 8).solvePartOne())
    println(Day08(2020, 8).solvePartTwo())
}

class Day08(
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
        return Program(input).runUntilFirstLoop().accumulator
    }

    fun solvePartTwo(): Int {
        readInput()
        input.forEachIndexed { index, instruction ->
            when (instruction.operation) {
                Operation.NOP -> replaceOperation(index, instruction)
                Operation.ACC -> null
                Operation.JMP -> replaceOperation(index, instruction)
            }?.let { fixedProgram ->
                val (programCounter, accumulator) = Program(fixedProgram).runUntilFirstLoop()
                if (programCounter == fixedProgram.size) {
                    return accumulator
                }
            }
        }
        throw IllegalArgumentException("Input is not valid")
    }

    private fun replaceOperation(index: Int, instruction: Instruction): List<Instruction> {
        return if (instruction.operation == Operation.NOP) {
            input.toMutableList().also { it[index] = Instruction(Operation.JMP, instruction.value) }
        } else {
            input.toMutableList().also { it[index] = Instruction(Operation.NOP, instruction.value) }
        }
    }
}