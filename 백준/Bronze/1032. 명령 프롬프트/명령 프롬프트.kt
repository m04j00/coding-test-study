fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fileNames = mutableListOf<String>()
    var result = ""

    for (i in 0 until n) fileNames.add(readLine())
    val nameLength = fileNames[0].length

    for (i in 0 until nameLength) {
        var flag = true
        val target = fileNames[0][i]
        for (j in 1 until n) {
            if (target != fileNames[j][i]) {
                flag = false
                break
            }
        }
        result += if (flag) target
        else "?"
    }

    println(result)

}
