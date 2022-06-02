import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    repeat(len) {
        val a = sc.nextInt()
        if(a==1){
            println("HARD")
            return
        }
    }
    println("EASY")
}