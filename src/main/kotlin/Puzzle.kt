import util.readRawInput

abstract class Puzzle<T>(private val year: Int, private val day: Int, private val public: Boolean = false) {
    lateinit var input: List<T>
    val inputFileName = buildInputFileName()
    val rawInput = readRawInput(inputFileName)

    abstract fun readInput()

    private fun buildInputFileName(): String {
        val suffix = if (public) "_public" else ""
        return "year${year}/day$day$suffix.txt"
    }
}