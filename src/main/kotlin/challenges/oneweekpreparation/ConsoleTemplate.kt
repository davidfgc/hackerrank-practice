package challenges.oneweekpreparation

import java.io.*

object ConsoleTemplate {

    fun main(input: String, processLine: (String) -> Unit): String {
        val stdin = System.`in`
        val stdOut = System.out
        var programOutput: String

        try {
            ByteArrayOutputStream().use { byteArrayOutputStream ->
                PrintStream(byteArrayOutputStream).use { outputPs ->
                    System.setIn(ByteArrayInputStream(input.toByteArray()))
                    // Use my stream
                    System.setOut(outputPs)

                    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
                    bufferedReader.lines().forEach { processLine(it) }

                    System.out.flush()
                    programOutput = byteArrayOutputStream.toString()
                }
            }
        } finally {
            // Put things back
            System.setIn(stdin)
            System.setOut(stdOut)
        }
        return programOutput
    }
}