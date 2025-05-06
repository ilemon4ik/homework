fun main() {
    lesson_six()
}

fun lesson_six() {
    println("Введите высоту лесенки: ")
    val height = readLine()!!.toInt()

    for (i in height downTo 1) {
        repeat(i) {
            print("#")
        }
        println()
    }
}