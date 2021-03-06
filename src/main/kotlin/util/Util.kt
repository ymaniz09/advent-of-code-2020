package util

import Puzzle

fun readRawInput(fileName: String): List<String> =
    Puzzle::class.java.getResourceAsStream(fileName).bufferedReader().readLines()

fun readInputText(fileName: String) = Puzzle::class.java.getResource(fileName).readText()

fun readNewLineSeparatedInputText(fileName: String) =
    readInputText(fileName).split(System.lineSeparator() + System.lineSeparator())
