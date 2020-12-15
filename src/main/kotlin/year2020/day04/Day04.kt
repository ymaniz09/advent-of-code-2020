package year2020.day04

import Puzzle
import util.readNewLineSeparatedInputText
import year2020.day04.InputReader.buildAttributesMap
import year2020.day04.PassportValidator.isValid
import year2020.day04.PassportValidator.validateStrictRules
import java.lang.System.lineSeparator

fun main() {
    println(Day04(2020, 4).solvePartOne())
    println(Day04(2020, 4).solvePartTwo())
}

class Day04(
    year: Int,
    day: Int,
    public: Boolean = false
) : Puzzle<Map<String, String>>(year, day, public) {

    override fun readInput() {
        input = readNewLineSeparatedInputText(inputFileName)
            .removeLineSeparators().map {
                buildAttributesMap(it)
            }
    }

    fun solvePartOne(): Int {
        readInput()
        return input.count { isValid(it) }
    }

    fun solvePartTwo(): Int {
        readInput()
        return input.count { validateStrictRules(it) }
    }

    private fun Iterable<String>.removeLineSeparators() = this.map { it.replace(lineSeparator(), " ") }
}