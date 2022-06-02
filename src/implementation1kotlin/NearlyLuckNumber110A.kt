import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextLine()
    val temp = tc.toCharArray()
    var count = 0
    temp.forEach {
        if (it == '4' || it == '7') {
            count++
        }
    }
    if (count == 4 || count == 7) {
        println("YES")
    } else  {
        println("NO")
    }

}