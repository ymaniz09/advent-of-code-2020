package year2020.day05

object SeatDecoder {
    fun getDecimalSeatPosition(seat: String): Int {
        return seat.map {
            if (it == 'B' || it == 'R') 1 else 0
        }
            .joinToString("")
            .toInt(2)
    }
}