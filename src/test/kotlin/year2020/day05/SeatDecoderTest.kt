package year2020.day05

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SeatDecoderTest {
    @Test
    fun `FBFBBFF should be decoded to 44`() {
        val input = "FBFBBFF"
        assertEquals(44, SeatDecoder.getDecimalSeatPosition(input))
    }

    @Test
    fun `FBFBBFFRLR should be decoded to 357`() {
        val input = "FBFBBFFRLR"
        assertEquals(357, SeatDecoder.getDecimalSeatPosition(input))
    }
}