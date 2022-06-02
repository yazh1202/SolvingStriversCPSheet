import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val name = sc.nextLine()
    val set = mutableSetOf<Char>()
    name.forEach { it ->
        set.add(it)
    }
    println(findOdd(set.size))
}

//Using Higher Order Function
var findOdd: (Int) -> String = { num -> if (num % 2 == 0) "CHAT WITH HER!" else "IGNORE HIM!" }