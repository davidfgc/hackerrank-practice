package challenges.oneweekpreparation

object Day3 {

    fun findZigZagSequence(values: List<Int>): String {
        val sorted = values.sorted().toMutableList()
        var leftIndex = (values.count() / 2.0).toInt()
        var rightIndex = values.count() - 1

        while (leftIndex < rightIndex) {
            val temp = sorted[rightIndex]
            sorted[rightIndex] = sorted[leftIndex]
            sorted[leftIndex] = temp
            leftIndex++
            rightIndex--
        }

        return sorted.joinToString(" ")
    }

}
