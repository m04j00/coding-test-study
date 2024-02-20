fun main() = with(System.`in`.bufferedReader()) {
    val logo = "DKSH"

    val input = readLine()
    var count = 0

    for (i in input.indices) {
        if (input[i] == logo[0] && i + 4 <= input.length && input.substring(i, i + 4) == logo) count++
    }
    
    println(count)
}
