package day01

import Puzzle

fun readInput(fileName: String): List<String> =
    Puzzle::class.java.getResourceAsStream(fileName).bufferedReader().readLines()