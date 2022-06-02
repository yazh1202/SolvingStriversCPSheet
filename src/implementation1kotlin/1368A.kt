import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    repeat(tc) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val n = sc.nextInt()
        findTimes(a, b, n)
    }
}

fun findTimes(a: Int, b: Int, n: Int) {
    var max = a.coerceAtLeast(b)
    var min = a.coerceAtMost(b)
    var count = 0
    while (max <= n && min <= n) {
        if (max > min) {
            min += max
        } else {
            max += min
        }
        count++
    }
    println(count)
}
