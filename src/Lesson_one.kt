fun main() {
    two()
}

fun one(){
    print("Hello world!")
}
fun two(){
    print("Hellow world, (Введите своё имя)")
    val name = readln()
    print("Hello world, $name!")
}
