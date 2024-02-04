import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")
    val n = stringTokenizer.nextToken().toInt()
    val k = stringTokenizer.nextToken().toInt()
    val products = mutableListOf<Product>()
    val dp = Array(n + 1) { Array(k + 1) { 0 } }

    for (i in 1..n) {
        stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")
        products.add(Product(w = stringTokenizer.nextToken().toInt(), v = stringTokenizer.nextToken().toInt()))
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
