import day01.readRawInput

abstract class Puzzle<T>(private val day: Int, private val public: Boolean = false) {
    lateinit var input: List<T>
    private val inputFileName = buildInputFileName()
    val rawInput = readRawInput(inputFileName)

    abstract fun readInput()

    private fun buildInputFileName(): String {
        val suffix = if (public) "_public" else ""
        return "day%02d$suffix.txt".format(day)
    }
}