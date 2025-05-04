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