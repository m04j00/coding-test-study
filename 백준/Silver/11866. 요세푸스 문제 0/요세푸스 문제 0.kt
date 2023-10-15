import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")
    val n = stringTokenizer.nextToken().toInt()
    val k = stringTokenizer.nextToken().toInt()
    val peopleQue = LinkedList<Int>()
    val resultList = mutableListOf<Int>()

    for (i: Int in 1..n) peopleQue.add(i)
    var count = 1

    while (peopleQue.size > 0) {
        if (count % k == 0) resultList.add(peopleQue.pollFirst())
        else peopleQue.offerLast(peopleQue.pollFirst())
        count++
    }
    
    print("<")
    for (i in resultList) {
        if (i != resultList.last()) print("$i, ")
        else print("$i>")
    }
}
