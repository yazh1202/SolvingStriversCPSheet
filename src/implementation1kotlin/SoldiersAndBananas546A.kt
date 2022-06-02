import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val n = sc.nextInt()
    val w = sc.nextInt()
    val cost = (w * (2 * k + ((w - 1) * k))) / 2
    println((cost - n).coerceAtLeast(0))
}