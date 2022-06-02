import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var sub = sc.nextInt()
    val times = sc.nextInt()
    repeat(times) {
        if (sub % 10 == 0) {
            sub /= 10
        } else {
            sub--
        }
    }
    println(sub)
}