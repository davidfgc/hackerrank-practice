package challenges.oneweekpreparation

import java.util.*

object Day6 {
    fun legoBlocks(values: List<Int>): Int {
        val height = values[0]
        val width = values[1]


        return 0
    }

    fun cookies(k: Int, A: IntArray): Int {
        val pq = PriorityQueue<Int>()
        pq.addAll(A.toList())
        var movementsCount = 0
        while (pq.size >= 2 && pq.peek() < k) {
            val first = pq.poll()
            val second = pq.poll()
            val newCookie = first + 2 * second
            pq.add(newCookie)
            movementsCount++
        }

        return if (pq.peek() < k) -1 else movementsCount
    }
}
