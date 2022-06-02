package implementation

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val cubes = sc.nextInt()
    var sum = 0
    var count = 0
    while (true) {
        count++
        sum += (((count) * (count + 1)) / 2)
        if(sum>cubes){
            println(count-1)
            return
        }
    }
}