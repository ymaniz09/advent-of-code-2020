package util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

internal class SequenceTest {
    @Test
    fun `should create sequence with four repetitions`() {
        val input = listOf(1, 2, 3, 4)
        val inputFourTimes = Collections.nCopies(4, input).toList().flatten()
        assertEquals(inputFourTimes, input.asSequence().asInfinite().take(16).toList())
    }
}