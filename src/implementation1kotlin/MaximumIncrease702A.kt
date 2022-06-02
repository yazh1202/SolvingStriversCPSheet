import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    //Not using space and storing the previous value only
    //to see if series is continued or not
    var temp = Integer.MAX_VALUE
    var count = 0
    var mc = 0
    repeat(len) {
        val v = sc.nextInt()
        if (v > temp) {
            count++
        } else {
            count = 1
        }
        temp = v
        mc = mc.coerceAtLeast(count)
    }
    println(mc)
}

//Using Memory to store  the array and find the maximum continuous increasing subarray
fun findMaxLength(arr: MutableList<Int>) {
    var count = 1
    var mcount = 0
    var temp = arr[0]
    arr.forEach {
        if (it > temp) {
            count++
        } else {
            count = 1
        }
        mcount = count.coerceAtLeast(mcount)
        temp = it
    }
    println(mcount)
}
