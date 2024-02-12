fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        readLine()
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val sejun = mutableListOf<Int>()
        val sebi = mutableListOf<Int>()
        readLine().split(" ").sorted().map { sejun.add(it.toInt()) }
        readLine().split(" ").sorted().map { sebi.add(it.toInt()) }

        do {
            if (sejun[0] == sebi[0]) {
                sebi.removeAt(0)
            } else if (sejun[0] > sebi[0]) {
                sebi.removeAt(0)
            } else {
                sejun.removeAt(0)
            }
        } while (sejun.isNotEmpty() && sebi.isNotEmpty())

        if (sejun.isEmpty()) println('B')
        else println('S')
    }

}
