import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt()
    var count = 0
    repeat(tc+1) {
            when (readln()) {
                "Cube" -> count += 6
                "Tetrahedron" -> count += 4
                "Octahedron" -> count += 8
                "Dodecahedron" -> count += 12
                "Icosahedron" -> count += 20
            }
    }
    println(count)
}