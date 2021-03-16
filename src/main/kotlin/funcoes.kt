fun main() {

    val x = 2
    val y = 6
    val s = somar(2, 6)
    val sub = subtracao(8, 6)
    val mul = multiplicacao(5, 2)
    val div = divisao(10, 5)

    println(s)
    println(sub)
    println(mul)
    println(div)
}

fun somar(x: Int, y: Int): Int {
    return x + y
}

fun subtracao(x: Int, y: Int): Int {
    return x - y
}

fun multiplicacao(x: Int, y: Int): Int {
    return x * y
}

fun divisao(x: Int, y: Int): Int {
    return x / y
}