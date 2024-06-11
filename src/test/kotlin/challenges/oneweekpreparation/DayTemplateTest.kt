package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DayTemplateTest {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun testDataMethod() {
        readData()
        testData.forEachIndexed { index, it ->
            println(it)
            val values = it.first.trim().split(" ").map { it.trim().toInt() }

            val res = Day3.findZigZagSequence(values)

            assertEquals(it.third, res, "Failed test case #${index + 1}")
        }
    }

    @Test
    fun testMethod() {
        val input = ""
        val expected = ""

        val output = "" // DayX.method(input)

        assertEquals(expected, output)
    }

    private fun readData() {
        val input = DataReader.readResourceFile("template-input")
        val output = DataReader.readResourceFile("template-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, "", output[index]))
        }
    }

    private fun linesToMatrix(lines: List<String>) =
        lines.map {
            it.split(" ").map { value -> value.toInt() }.toTypedArray()
        }.toTypedArray()
}