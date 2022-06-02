package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val name: String = sc.nextLine()
    val str = StringBuilder(name)
    str[0] = str[0].uppercaseChar()
    println(str)
}
