package implementation1kotlin

import java.util.*

/** String equals() VS contentEquals():
The equals() method is to compare the contents of two Strings are same whereas contentEquals method is to
compare String with StringBuffer or StringBuilder. But both are to compare the contents.
In other words, contentEquals method does equals() method + additional comparison with StringBuffer, StringBuilder, etc.**/
fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    sc.nextLine()
    var res = 0
    repeat(tc) {
        val stmt = sc.nextLine()
        if (stmt.equals("++X") || stmt.equals("X++")) {
            res++
        } else {
            res--
        }
    }
    println(res)
}
