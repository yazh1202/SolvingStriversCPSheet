import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tb = sc.nextLine()
    val tbc = tb.toCharArray()
    val hd = sc.nextLine()
    val hdc = hd.toCharArray()
    hdc.forEach {
        if (it == tbc[0] || it == tbc[1]) {
            println("YES")
            return
        }
    }
    println("NO")
}
