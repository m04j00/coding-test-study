fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()

    val a = readLine().split(" ").map { it.toInt() }

    println(a.max() * a.min())

}
