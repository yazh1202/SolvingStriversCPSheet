package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    sc.nextLine()
    repeat(tc) {
        val s = sc.nextLine()
        findMin(s.toCharArray())
    }
}

fun findMin(s: CharArray) {
    var last = -1
    var ind = 0
    var count = 0
    while (ind < s.size) {
        while (ind < s.size && s[ind] == '1') {
            last = ind
            ind++
        }
        while (ind < s.size && s[ind] == '0') {
            ind++
        }
        if (last != -1 && ind < s.size) {
            count += (ind - last - 1)
        }
    }
    println(count)
}