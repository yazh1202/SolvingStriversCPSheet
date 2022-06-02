import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    var capacity = 0
    var max = 0
    repeat(tc) {
        val go = sc.nextInt()
        val cm = sc.nextInt()
        capacity += (cm - go)
        max = Math.max(capacity, max)
    }
    println(max)
}