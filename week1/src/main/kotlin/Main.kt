fun main(args: Array<String>) {

    print("Sayfa 9 = John ")
    print("Doe ")
    println("Sayfa 9 = John Doe")
    println("Sayfa 9 = " + 54)

    println()

    println("Sayfa 10 = ${sub1(10, 4)}")
    println("Sayfa 10 = ${sub2(9, 5)}")
    printSub(4, 2)

    println()

    val a: Int = 15
    println("Sayfa 11 = a = $a")
    val b = 34
    println("Sayfa 11 = b =  $b")
    val c: Int
    c = 8
    println("Sayfa 11 = c = $c")
    var x = 26
    println("Sayfa 11 = x = $x")

    x -= 4
    println("Sayfa 11 = x =  $x")
    val e = 2.72
    println("Sayfa 11 = e = $e")

    var x2 = 16
    fun decrementX() {
        x2-=9
    }
    decrementX()
    println("Sayfa 11 = x2 = $x2")

    println()

    val addOp1 = AddOperation(15, 19)
    println("Sayfa 12 = ${addOp1.result}")
    val subOp1 = SubOperation(9, 4)
    println("Sayfa 12 = ${subOp1.result}")

    println()

    var d = 15
    val s1 = "d is $d"

    d = 2

    val s2 = "${s1.replace("is", "was")}, but now is $d"
    println("Sayfa 14 = $s2")

    println()

    println("Sayfa 15 = ${maxOf(42, 16)}")
    println("Sayfa 15 = ${maxOfOneLine(12, 91)}")

    println()

    val langs = listOf<String>("Java", "Kotlin", "JS")
    for (lang in langs){
        println("Sayfa 16 = $lang")
    }
    for (index in langs.indices){
        println("Sayfa 16 = lang at $index is ${langs[index]}")
    }

    println()

    var index = 0
    while (index < langs.size){
        println("Sayfa 17 = ${langs[index++]}")
    }

    println()

    println("Sayfa 18 = ${menuOptions('f')}")

}

fun menuOptions(key: Char): String =
    when (key) {
        'q' -> "quit"
        'v' -> "view"
        'f' -> "full screen"
        else -> "invalid key"
    }

fun maxOfOneLine(a: Int, b: Int) = if (a>b) a else b

fun maxOf(a: Int, b: Int): Int {
    if (a>b) {
        return a
    } else {
        return b
    }
}

class Operation

class AddOperation(val a: Int, val b: Int){
    val result = a + b
}

open class MathOperation

class SubOperation(val a: Int, val b: Int): MathOperation() {
    val result = a - b
}

open class Animal

fun sub1(a: Int, b: Int): Int {
    return a - b
}

fun sub2(a: Int, b: Int) = a - b

fun printSub(a: Int, b: Int): Unit {
    println("Sayfa 10 = subtraction of $a and $b is ${a - b}")
}



