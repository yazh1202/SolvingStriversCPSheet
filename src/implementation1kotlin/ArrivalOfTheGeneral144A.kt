import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    val number = arrayListOf<Int>()
    repeat(tc) {
        number.add(sc.nextInt())
    }
    findTime(number)
}

fun findTime(list: ArrayList<Int>) {
    var max = Integer.MIN_VALUE
    var min = Integer.MAX_VALUE
    var mInd = Int.MAX_VALUE
    var minInd = -1
    list.forEach {
        if (max < it) {
            max = it
            mInd = list.indexOf(max)
        }
        if (min >= it) {
            min = it
            minInd = list.lastIndexOf(it)
        }
    }
    var sum = (mInd) + (list.size - 1 - minInd)
    if (minInd < mInd) {
        sum--
    }
    println(sum)
}