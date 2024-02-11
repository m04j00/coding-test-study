fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputGrid = Array(n) { Array(n) { 0 } }
    val grid = Array(n) { Array(n) { false } }

    for (i in 0 until n) {
        inputGrid[i] = readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    for (i in 0 until n) {
        for (j in 0 until 5) {
            val target = inputGrid[i][j]
            for (k in 0 until n) {
                if (i == k) continue
                if (target == inputGrid[k][j]) grid[i][k] = true
            }
        }
    }

    val result = mutableListOf<Int>()
    for (i in 0 until n) {
        result.add(grid[i].count { it })
    }

    println(result.indexOf(result.max()) + 1)
}
