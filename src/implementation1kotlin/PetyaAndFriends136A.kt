import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    val list = MutableList(tc) { 0 }
    var s = 1
    repeat(tc) {
        val temp = sc.nextInt()
        list[temp - 1] = s++
    }
    list.forEach {
        print(it)
        print(" ")
    }
}
