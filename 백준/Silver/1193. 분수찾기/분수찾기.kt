fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toInt()
    var denominator = 1
    var numerator = 1
    var a = 1
    var count = 1

    do {
        var i = 1
        var j = a
        while (i <= a && j >= 1) {
            if (a % 2 == 0) {
                denominator = j--
                numerator = i++
            } else {
                numerator = j--
                denominator = i++
            }
            count++
            if (count > x) break
        }
        a++
    } while (count <= x)

    println("$numerator/$denominator")
}
