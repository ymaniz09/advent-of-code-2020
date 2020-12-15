package year2020.day04

object InputReader {
    fun buildAttributesMap(allAttributes: String):
            Map<String, String> {
        return allAttributes.split(" ").map { attributes ->
            val (key, value) = attributes.split(":")
            key to value
        }.toMap()
    }
}