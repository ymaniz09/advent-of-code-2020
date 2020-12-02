package day01

import Puzzle

fun readRawInput(fileName: String): List<String> =
    Puzzle::class.java.getResourceAsStream(fileName).bufferedReader().readLines()