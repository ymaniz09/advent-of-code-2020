package year2020.day4

object PassportValidator {
    private val requiredFields: Set<String> = setOf("byr", "iyr", "eyr", "hcl", "ecl", "pid", "hgt")

    fun isValid(passport: Map<String, String>): Boolean {
        return requiredFields.intersect(passport.keys) == requiredFields
    }

    fun validateStrictRules(passport: Map<String, String>): Boolean {
        if (!isValid(passport)) return false

        return passport.entries.all { (key, value) ->
            when (key) {
                "byr" -> value.toInt() in 1920..2002
                "iyr" -> value.toInt() in 2010..2020
                "eyr" -> value.toInt() in 2020..2030
                "hgt" -> validateHeight(value)
                "hcl" -> validateHairColor(value)
                "ecl" -> validateEyeColor(value)
                "pid" -> validatePassportId(value)
                "cid" -> true
                else -> false
            }
        }
    }

    fun validateHeight(value: String): Boolean {
        return when {
            value.endsWith("cm") -> {
                value.removeSuffix("cm").toInt() in 150..193
            }
            value.endsWith("in") -> {
                value.removeSuffix("in").toInt() in 59..76
            }
            else -> {
                false
            }
        }
    }

    fun validateHairColor(value: String): Boolean {
        return "#[0-9a-f]{6}".toRegex().matches(value)
    }

    fun validateEyeColor(value: String): Boolean {
        return value in listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth")
    }

    fun validatePassportId(value: String): Boolean {
        return "[0-9]{9}".toRegex().matches(value)
    }
}