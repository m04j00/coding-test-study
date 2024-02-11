import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val row = Array(m) { false }
    val column = Array(n) { false }

    for (i in 0 until n) {
        val line = readLine()
        for (j in 0 until m) {
            if (line[j] == 'X') {
                column[i] = true
                row[j] = true
            }
        }
    }
    println(max(row.count { !it }, column.count { !it }))
}
