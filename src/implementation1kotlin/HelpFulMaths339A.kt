package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    countEasy(str)
}

//Using Counting
fun countEasy(str: String) {
    var c1 = 0
    var c2 = 0
    var c3 = 0
    var string = ""
    str.toCharArray().forEach {
        if (it == '1') {
            c1++
        } else if (it == '2') {
            c2++
        } else if (it == '3') {
            c3++
        }
    }
    while (c1 > 0) {
        string = string + "1+"
        c1--
    }
    while (c2 > 0) {
        string = string + "2+"
        c2--
    }
    while (c3 > 0) {
        string = string + "3+"
        c3--
    }
    println(string.substring(0, string.length - 1))
}

//Using Sorting
fun makeEasy(str: String) {
    val numbers = mutableListOf<Int>()
    str.toCharArray().forEach {
        if (it != '+') {
            numbers.add(it.toString().toInt())
        }
    }
    numbers.sort()
    var string = ""
    numbers.forEach {
        string = "$string$it+"
    }
    println(string.substring(0, string.length - 1))
}
