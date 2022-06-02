import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = arrayListOf<Int>()
    repeat(3) {
        a.add(sc.nextInt())
    }
    a.sort()
    val answer: Int = a[2] - a[1] + (a[1] - a[0])
    println(answer)
}