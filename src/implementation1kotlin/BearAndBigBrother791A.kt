package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var l = sc.nextInt()
    var b = sc.nextInt()
    var c = 0
    while (l <= b) {
        c++
        l *= 3
        b *= 2
    }
    println(c)
}