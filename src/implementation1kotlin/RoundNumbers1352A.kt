import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var tc = sc.nextInt()
    while ((tc--) > 0) {
        val number = sc.nextInt()
        findRound(number)
    }
}

fun findRound(a: Int) {
    var t = a
    var div = 1
    val store = mutableListOf<Int>()
    while (t > 0) {
        if(t%10>0) {
            store.add((t % 10) * div)
        }
        div *= 10
        t /= 10
    }
    println(store.size)
    store.forEach {
        print(it)
        print(" ")
    }
    println()

}