package year2020.day4

import Puzzle
import util.readNewLineSeparatedInputText
import year2020.day4.InputReader.buildAttributesMap
import year2020.day4.PassportValidator.isValid
import year2020.day4.PassportValidator.validateStrictRules
import java.lang.System.lineSeparator

fun main() {
    println(Day4(2020, 4).solvePartOne())
    println(Day4(2020, 4).solvePartTwo())
}

class Day4(
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