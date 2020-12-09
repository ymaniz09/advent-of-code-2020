package year2020.day8

class Program(private val instructions: List<Instruction>) {
    private var accumulator: Int = 0
    private var pc: Int = 0

    fun runUntilFirstLoop(): Int {
        val executed = mutableSetOf<Int>()

        while (pc !in executed) {
            executed.add(pc)

            val (instruction, value) = instructions[pc]

            when (instruction) {
                Operation.ACC -> applyAcc(value)
                Operation.JMP -> applyJmp(value)
                Operation.NOP -> applyNop(value)
            }
        }

        return accumulator
    }

    private fun applyNop(value: Int) {
        pc += 1
    }

    private fun applyJmp(value: Int) {
        pc += value
    }

    private fun applyAcc(value: Int) {
        accumulator += value
        pc += 1
    }
}