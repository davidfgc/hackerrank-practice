package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConsoleTemplateTest {

    @Test
    fun testMethod() {
        val input = DataReader.readResourceFile("template-input").joinToString("\n") + "\n"
        val expectedOutput = DataReader.readResourceFile("template-output").joinToString("\n") + "\n"

        val programOutput = ConsoleTemplate.main(input) { line ->
//            val values = line.trim().split(" ").map { it.trim().toInt() }
//            val value = line.trim().toInt()

            val res = if (line == "input") "output" else ""

            println(res)
        }

        assertEquals(expectedOutput, programOutput)
    }
}