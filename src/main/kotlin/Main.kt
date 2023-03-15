fun main() {
    print(solution("abc"))
}

fun solution(inputString: String): String {
    val reflected = inputString.map {
        ('a'.code + 'z'.code - it.code).toChar()
    }
    return reflected.joinToString("")
}
