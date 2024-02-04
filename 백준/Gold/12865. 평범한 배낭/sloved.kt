import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val products = mutableListOf<Product>()
    val dp = Array(n + 1) { Array(k + 1) { 0 } }

    repeat(n) {
        val (w, v) = readLine().split(" ").map { it.toInt() }
        products.add(Product(w, v))
    }

    for (i in 1..n) {
        for (j in 1..k) {
            val weight = products[i - 1].w
            dp[i][j] =
                if (j < weight) {
                    dp[i - 1][j]
                } else {
                    val value = products[i - 1].v
                    max(dp[i - 1][j], value + dp[i - 1][j - weight])
                }
        }
    }

    println(dp[n][k])
}

data class Product(
    val w: Int = 0,
    val v: Int = 0,
)
