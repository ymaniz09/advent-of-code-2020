package year2020.day4

import Puzzle
import util.readInputText
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
        val stringInput = readInputText(inputFileName)
        val split = stringInput.split(lineSeparator() + lineSeparator())
        val clean = split.map { it.replace(lineSeparator(), " ") }

        input = clean.map {
            buildAttributesMap(it)
        }.toList()
    }

    fun solvePartOne(): Int {
        readInput()
        return input.count { isValid(it) }
    }

    fun solvePartTwo(): Int {
        readInput()
        return input.count { validateStrictRules(it) }
    }
}