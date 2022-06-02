import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val l = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val p = sc.nextInt()
    val nl = sc.nextInt()
    val np = sc.nextInt()
    val t1 = (c * d).coerceAtMost((p / np)).coerceAtMost((k * l) / nl)
    println(t1 / n)

}