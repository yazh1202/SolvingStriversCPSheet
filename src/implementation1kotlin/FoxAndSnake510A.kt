import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val row = sc.nextInt()
    val col = sc.nextInt()
    printSnake(row, col)
}

fun printSnake(row: Int, col: Int) {
    var r = 0
    var c = 0
    while (r++ < row) {
        while (c++ < col) {
            if (r % 2 != 0) {
                print("#")
            } else {
                if (r % 4 == 0 && c == 1) {
                    print("#")
                } else if (r%4!=0&&c == (col)) {
                    print("#")
                } else {
                    print(".")
                }
            }
        }
        println()
        c = 0
    }
}
