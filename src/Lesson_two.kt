import java.util.*

fun  main(){
    lesson_two_one()
}

fun lesson_two_one(){

    print("Введите длину прямоугольника: ")
    val length = readLine()!!.toInt()

    print("Введите ширину прямоугольника: ")
    val width = readLine()!!.toInt()

    val perimeter = 2 * (length + width)
    val area = length * width

    println("Периметр прямоугольника: $perimeter")
    println("Площадь прямоугольника: $area")
}

fun lesson_two_two(){

    println("Введите ваше кол-во баллов: ")
    val point = readLine()!!.toInt()

    if (point >= 90 && point <= 100) {
        println("Оценка А:" + point)
    } else if (point >= 75) {
        println("Оценка B:" + point)
    } else if (point >= 50) {
        println("Оценка C:" + point)
    } else if (point >= 30) {
        println("Оценка D:" + point)
    } else if (point >= 0) {
        println("Оценка F:" + point)
    }
}

fun lesson_two_three(){

    println("Введите число N")
    val numberN = readLine()!!.toInt()

    for (i in 1..10) {
        println(numberN.toString() + " * " + i + " = " + numberN * i)
    }
}

fun lesson_two_dopzadanie() {

    var condition = true

    do {
        println("Введите число")
        val number = readLine()!!.toInt()
        if (number < 0) {
            condition = false
        } else {
            println("Вы ввели число: " + number)
        }
    } while (condition)

    println("Число отрицательное, программа завершилась!")

}



