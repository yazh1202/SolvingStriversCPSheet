package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    repeat(tc) {
        if (sc.hasNextLine()) {
            calc(sc.nextInt().toString())
        }
    }
}

fun calc(n: String) {
    val num = (n.toInt()) % 10
    val total = (num - 1) * 10 + ((n.length * (n.length + 1)) / 2)
    println(total)
}
