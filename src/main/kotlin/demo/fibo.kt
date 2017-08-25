package demo

fun main(args: Array<String>) {
    var current = 1
    var previous = 0
    var retour: Int

    var index = 0
    while (index < 100) {
        index++
        retour = fibo(previous, current)
        println(retour)
        previous = current
        current = retour
    }
}

fun fibo(previous: Int, current: Int): Int {
    return (previous + current)
}

