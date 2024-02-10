fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fileNames = Array(n) { "" }

    for (i in 0 until n) fileNames[i] = readLine()

    val nameLength = fileNames[0].length
    val separatedFileName = Array(n) { Array(nameLength) { "" } }
    var result = ""

    for (i in 0 until n) {
        separatedFileName[i] = fileNames[i].split("").toTypedArray()
    }

    for (i in 1..nameLength) {
        var flag = true
        val target = separatedFileName[0][i]
        for (j in 1 until n) {
            if (target != separatedFileName[j][i]) {
                flag = false
                break
            }
        }
        result += if (flag) target
        else "?"
    }

    println(result)

}
