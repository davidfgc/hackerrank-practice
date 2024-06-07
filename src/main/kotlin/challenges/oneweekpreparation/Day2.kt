package challenges.oneweekpreparation

class Day2 {

    companion object {
        fun flippingMatrix(matrix: Array<Array<Int>>): Int {
            val size = matrix.size / 2
            var sum = 0

            for (row in 0..<size) {
                for (col in 0..<size) {
                    sum += getMaxValue(matrix, row, col)
                }
            }

            return sum
        }

        private fun getMaxValue(matrix: Array<Array<Int>>, row: Int, col: Int): Int {
            val values = listOf(
                matrix[row][col],
                matrix[row][matrix.size - 1 - col],
                matrix[matrix.size - 1 - row][col],
                matrix[matrix.size - 1 - row][matrix.size - 1 - col],
            )
            return values.max()
        }
    }
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toInt()

        val matrix = Array<Array<Int>>(2 * n, { Array<Int>(2 * n, { 0 }) })

        for (i in 0 until 2 * n) {
            matrix[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = Day2.flippingMatrix(matrix)

        println(result)
    }
}

