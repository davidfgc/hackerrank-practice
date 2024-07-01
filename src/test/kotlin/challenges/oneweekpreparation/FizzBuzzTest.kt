package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun testMethod() {
        val input = DataReader.readResourceFile("fizzbuzz-input").joinToString("\n") + "\n"
        val expectedOutput = DataReader.readResourceFile("fizzbuzz-output").joinToString("\n") + "\n"

        val programOutput = ConsoleTemplate.main(input) { line ->
            val value = line.trim().toInt()

            FizzBuzz.fizzbuzz(value)
        }

        assertEquals(expectedOutput, programOutput)
    }
}