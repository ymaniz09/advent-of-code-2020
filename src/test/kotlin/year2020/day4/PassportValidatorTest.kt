package year2020.day4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import year2020.day4.InputReader.buildAttributesMap

internal class PassportValidatorTest {
    @Test
    fun `if height is in cm, the number must be at least 150 and at most 193`() {
        assertFalse(PassportValidator.validateHeight("149cm"))
        assertTrue(PassportValidator.validateHeight("150cm"))
        assertTrue(PassportValidator.validateHeight("189cm"))
        assertTrue(PassportValidator.validateHeight("193cm"))
        assertFalse(PassportValidator.validateHeight("195cm"))
    }

    @Test
    fun `if height is in inches, the number must be at least 59 and at most 76`() {
        assertFalse(PassportValidator.validateHeight("58in"))
        assertTrue(PassportValidator.validateHeight("59in"))
        assertTrue(PassportValidator.validateHeight("70in"))
        assertTrue(PassportValidator.validateHeight("76in"))
        assertFalse(PassportValidator.validateHeight("80in"))
    }

    @Test
    fun `if height does not have unit, it is not valid`() {
        assertFalse(PassportValidator.validateHeight("58"))
        assertFalse(PassportValidator.validateHeight("149"))
    }

    @Test
    fun `#123abc is a valid hair color`() {
        assertTrue(PassportValidator.validateHairColor("#123abc"))
    }

    @Test
    fun `#123abz is an invalid hair color`() {
        assertFalse(PassportValidator.validateHairColor("#123abz"))
    }

    @Test
    fun `123abc is an invalid hair color`() {
        assertFalse(PassportValidator.validateHairColor("123abc"))
    }

    @Test
    fun `should accept all valid eye colors`() {
        assertTrue(PassportValidator.validateEyeColor("amb"))
        assertTrue(PassportValidator.validateEyeColor("blu"))
        assertTrue(PassportValidator.validateEyeColor("brn"))
        assertTrue(PassportValidator.validateEyeColor("gry"))
        assertTrue(PassportValidator.validateEyeColor("grn"))
        assertTrue(PassportValidator.validateEyeColor("hzl"))
        assertTrue(PassportValidator.validateEyeColor("oth"))
        assertFalse(PassportValidator.validateEyeColor("wat"))
    }

    @Test
    fun `should accept all valid passport IDs`() {
        assertTrue(PassportValidator.validatePassportId("000000001"))
        assertFalse(PassportValidator.validatePassportId("0123456789"))
    }

    @Test
    fun `should recognize invalid eyr`() {
        val input = "eyr:1972 cid:100 hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926"
        assertFalse(PassportValidator.validateStrictRules(buildAttributesMap(input)))
    }

    @Test
    fun `should recognize invalid hcl`() {
        val input = "hcl:dab227 iyr:2012 ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277"
        assertFalse(PassportValidator.validateStrictRules(buildAttributesMap(input)))
    }

    @Test
    fun `should recognize invalid hgt`() {
        val input = "hgt:59cm ecl:zzz eyr:2038 hcl:74454a iyr:2023 pid:3556412378 byr:2007"
        assertFalse(PassportValidator.validateStrictRules(buildAttributesMap(input)))
    }

    @Test
    fun `should recognize a valid input`() {
        var input = "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980 hcl:#623a2f"
        assertTrue(PassportValidator.validateStrictRules(buildAttributesMap(input)))

        input = "eyr:2029 ecl:blu cid:129 byr:1989 iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm"
        assertTrue(PassportValidator.validateStrictRules(buildAttributesMap(input)))

        input = "hcl:#888785 hgt:164cm byr:2001 iyr:2015 cid:88 pid:545766238 ecl:hzl eyr:2022"
        assertTrue(PassportValidator.validateStrictRules(buildAttributesMap(input)))

        input = "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719"
        assertTrue(PassportValidator.validateStrictRules(buildAttributesMap(input)))
    }
}