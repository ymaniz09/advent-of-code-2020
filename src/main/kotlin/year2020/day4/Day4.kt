package year2020.day4

import Puzzle
import util.readInputText
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

    private val requiredFields: Set<String> = setOf("byr", "iyr", "eyr", "hcl", "ecl", "pid", "hgt")

    override fun readInput() {

        val stringInput = readInputText(inputFileName)
        val split = stringInput.split(lineSeparator() + lineSeparator())
        val clean = split.map { it.replace(lineSeparator(), " ") }

        input = clean.map {
            it.split(" ").map { attributes ->
                val (key, value) = attributes.split(":")
                key to value
            }.toMap()
        }.toList()
    }

    fun isValid(passport: Map<String, String>): Boolean {
        return requiredFields.intersect(passport.keys) == requiredFields
    }

    fun solvePartOne(): Int {
        readInput()

        return input.count { isValid(it) }
    }

    fun solvePartTwo(): Int {
        return 0
    }
}