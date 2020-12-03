package day2

import Puzzle

fun main() {
    println(Day2(2).solvePartOne())
    println(Day2(2).solvePartTwo())
}

class Day2(
    day: Int,
    public: Boolean = false
) : Puzzle<Password>(day, public) {

    override fun readInput() {
        input = rawInput.map { rawInput ->
            val (range, letter, password) = rawInput.split(" ")
            val (minimum, maximum) = range.split("-").map { it.toInt() }

            Password(
                minimum = minimum,
                maximum = maximum,
                password = password,
                char = letter.first()
            )
        }
    }

    fun solvePartOne(): Int {
        readInput()
        return countValidPasswordsPartOne()
    }

    fun solvePartTwo(): Int {
        readInput()
        return countValidPasswordsPartTwo()
    }

    private fun countValidPasswordsPartOne(): Int {
        var validPasswords = 0
        input.forEach { password ->
            validPasswords += isPasswordInValidRange(password)
        }
        return validPasswords
    }

    private fun isPasswordInValidRange(password: Password): Int {
        val charCount = countCharOccurrenceInPassword(password)
        return if (charCount in password.minimum..password.maximum) 1 else 0
    }

    private fun countCharOccurrenceInPassword(password: Password) =
        password.password.count { char -> char == password.char }

    private fun countValidPasswordsPartTwo(): Int {
        var validPasswords = 0
        input.forEach {
            validPasswords += if (matchFirstPosition(it) xor matchSecondPosition(it)) 1 else 0
        }
        return validPasswords
    }

    private fun matchSecondPosition(pass: Password) = (pass.password[pass.maximum - 1] == pass.char)

    private fun matchFirstPosition(pass: Password) = pass.password[pass.minimum - 1] == pass.char
}

