package implementation1kotlin

import java.util.*

/**To convert an Int value to a Char, use the toChar() function.
The Int value should be in the range of Char codes Char.MIN_VALUE..Char.MAX_VALUE.**/

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val res = StringBuilder(str)
    for (i in str.indices) {
        val a = Character.getNumericValue(str[i])
        if (i == 0 && 9 - a == 0) {
            continue
        }
        res[i] = Character.forDigit((9 - a).coerceAtMost(a), 10)
    }
    println(res)
}