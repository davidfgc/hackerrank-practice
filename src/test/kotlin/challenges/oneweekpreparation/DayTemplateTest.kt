package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DayTemplateTest {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun testFileInput() {
        readData()
        testData.forEachIndexed { index, triple ->
            println(triple)
            val line = triple.first.trim()
//            val values = triple.first.trim().split(" ").map { it.trim().toInt() }

            val res = if (line == "input") "output" else ""

            assertEquals(triple.third, res, "Failed test case #${index + 1}")
        }
    }

    @Test
    fun testSingleInput() {
        val input = ""
        val expected = ""

        val output = "" // DayX.method(input)

        assertEquals(expected, output)
    }

    @Test
    fun testMethod() {
        val list = mutableListOf(1, 2, 3)

        val dropList = list.drop(1)

        assertEquals(listOf(2, 3), dropList)
    }

    private fun readData() {
        val input = DataReader.readResourceFile("template-input")
        val input2 = DataReader.readResourceFile("template-input2")
        val output = DataReader.readResourceFile("template-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, input2[index], output[index]))
        }
    }

    private fun linesToMatrix(lines: List<String>) =
        lines.map {
            it.split(" ").map { value -> value.toInt() }.toTypedArray()
        }.toTypedArray()
}