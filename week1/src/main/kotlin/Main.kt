import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import kotlin.Comparator
import kotlin.collections.HashSet

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

    println()

    val f = 5
    val g = 10

    if (f in 1..g-1){
        println("Sayfa 19 = fits in range")
    }

    val l = listOf("apple", "banana", "orange")
    if (-1 !in 0..l.lastIndex){
        println("Sayfa 19 = -1 is out of range")
    }

    if (l.size !in l.indices){
        println("Sayfa 19 = list size is out of valid list indices range, too")
    }

    print("Sayfa 19 = ")
    for (x in 1..20) {
        print(x)
    }

    println()

    print("Sayfa 19 = ")

    for (x in 1..12 step 2){
        print(x)
    }

    println()

    print("Sayfa 19 = ")
    for (x in 8 downTo 0 step 2){
        print(x)
    }

    println()

    val cities = listOf("toronto", "new york", "istanbul", "new orleans")

    cities
        .filter { it.startsWith("n") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach{println("Sayfa 20 = $it")}

    println()

    var h: String? = "nullable value"
    if(h == null){
        println("Sayfa 21 = h is null")
    }

    val obj = "this is indeed a string"
    if(obj is String){
        println("Sayfa 22 = ${obj.length}")
    }

    if (obj is String && obj.length > 0){
        println("Sayfa 22 = ${obj.length}")
    }

    if (obj !is String) println("Sayfa 22 = null")

    val WINDOW_WIDTH = 1080
    val WINDOW_HEIGHT = 720
    println("Sayfa 26 = $WINDOW_WIDTH")
    println("Sayfa 26 = $WINDOW_HEIGHT")

    val mutableCollection: MutableCollection<String> = HashSet()
    val PersonComparator: Comparator<Int>

    logIn()

    println()

    val list = listOf<Int>(15, 16, 19, 20, 23)

    val majors = list.filter { x -> x >= 18 }
    val majorsShort = list.filter { it > 0 }

    println("Sayfa 39 = $majors")
    println("Sayfa 39 = $majorsShort")

    println()

    val usernames = listOf("johndoe", "janedoe", "mordecai")

    if ("mordecai" in usernames){
        println("Sayfa 40 = mordecai is in registered")
    }

    if ("rigby" !in usernames){
        println("Sayfa 40 = rigby is NOT in registered")
    }

    val m = 55

    when(m){
        is Int -> println("Sayfa 41 = int instance")

        else -> println("Sayfa 41 = undefined instance")
    }

    println()

    val frequencies = mapOf("*" to 3, "#" to 5, "$" to 10)
    print("Sayfa 43 = $frequencies")

    println()

    print("Sayfa 44 = ")
    for ((k, v) in frequencies){
        print("$k -> $v ")
    }

    println()

    val lazyPet: String by lazy {
        println("Sayfa 45 = only works when it is invoked for the first time")
        "Garfield"
    }

    println("Sayfa 45 = $lazyPet")
    println("Sayfa 45 = $lazyPet")

    println()

    println("Sayfa 46 = ${"CONVERTTOLOWERCASE".toLowercaseExtension()}")

    println()

    val db = DbConnection
    db.disconnect()

    println()

    val car = Car()
    car.drive()

    println()

    val files = File("src/main/kotlin").listFiles()
    println("Sayfa 49 = ${files?.size}")

    println()

    println("Sayfa 50 = ${files?.size ?: "empty"}")

    val fileSize = files?.size ?: run {
        val someSize = 512
        someSize * 2
    }
    println("Sayfa 50 = $fileSize")

    println()

    val userValues = mapOf("username" to "johndoe", "password" to "1234")
    val username = userValues["username"] ?: throw IllegalArgumentException("No username")
    println("Sayfa 51 = $username")

    println()

    val emails = listOf("johndoe@example.com", "jdoe@example.com")
    val defaultEmail = emails.firstOrNull() ?: "no email found"
    println("Sayfa 52 = $defaultEmail")

    println()

    val value: String?
    value = "some value"
    value?.let {
        println("Sayfa 53 = $it")
    }

    println()

    val value2: String?
    value2 = null
    val mapped = value2?.let { transformValue(it) } ?: "Sayfa 54 = default value"
    println(mapped)

    println()

    val color = "R"
    println("Sayfa 55 = ${transformWhenValue(color)}")

    println()

    test()

    println()

    val assignedColor = if (color == "R"){
        "zero"
    } else if (color == "G"){
        "one"
    } else if (color == "B"){
        "two"
    } else {
        "other"
    }

    println("Sayfa 58 = $assignedColor")

    println()

    val arr = arrOfMinusOnes(5)
    println("Sayfa 59 = ${arr.contentToString()}")

    println()

    println("Sayfa 60 = ${theAnswer()}")
    println("Sayfa 60 = ${theAnswer2()}")

    println()

    val cook = Cook()

    with(cook){
        getRecipe()
        getIngredients()
        cook()
    }

    println()

    val user1 = User(1, "john doe").apply {
        uname = "johndoe"
    }

    println("Sayfa 62 = ${user1.uname}, ${user1.name}, ${user1.id}")

    println()

    val stream = Files.newInputStream(Paths.get("src/main/kotlin/file.txt"))
    stream.buffered().reader().use { reader ->
        println("Sayfa 63 = ${reader.readText()}")
    }

    println()

    genericFunction("generic function")

    println()

    var user2 = User(2, "jane doe")

    user2 = user2.also {
        println("Sayfa 66 = ${it.name}")
        it.uname = "janedoe"
    }

    println("Sayfa 65 = ${user2}")

    println()

    // Sayfa 66 = loadImage()

    sendMsgUser("hello")
    sendMsgUser("hello", "johndoe")

    println()

    println("Sayfa 68 = ${5 add 3}")
    println("Sayfa 68 = ${5.add(3)}")
    println("Sayfa 68 = ${3 times "hello"}")

    println()

    println("Sayfa 69 = ${"hello" * 3}")

    println()

    printAll("kotlin", "is", "fun")

}

fun printAll(vararg messages: String){
    for (m in messages){
        println("Sayfa 70 = $m")
    }
}
operator fun String.times(n: Int) = repeat(n)

infix fun Int.times(str: String) = str.repeat(this)

infix fun Int.add(x: Int): Int = this + x

fun sendMsgUser(msg: String, name: String = "anonymous"){
    println("Sayfa 67 = $msg, $name")
}

fun loadImage(): Unit = TODO("waiting for the graphics team to send the images")

inline fun <reified T> genericFunction(value: T){
    println("Sayfa 64 = $value")
}

data class User(
    val id: Int,
    val name: String,
    var uname: String = "anonymous",
)

class Cook{
    fun getRecipe() {
        println("Sayfa 61 = get recipe")
    }
    fun getIngredients() {
        println("Sayfa 61 = get ingredients")
    }
    fun cook() {
        println("Sayfa 61 = cook")
    }
}

fun theAnswer() = 55

fun theAnswer2(): Int {
    return 55
}

fun arrOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun test(){
    val res = try{
        println("Sayfa 56 = try block")
    } catch (e: ArithmeticException){
        throw IllegalArgumentException("Sayfa 56 = division by zero")
    }
}

fun transformWhenValue(color: String): Int {
    return when(color){
        "R" -> 0
        "G" -> 1
        "B" -> 2
        else -> throw IllegalArgumentException("invalid color")
    }
}

fun transformValue(value: String): String {
    return value.uppercase()
}

abstract class Vehicle{
    abstract fun drive()
    
}

class Car: Vehicle(){
    override fun drive() {
        println("Sayfa 48 = driving a car")
    }
}

object DbConnection {
    init {
        println("Sayfa 47 = connected to db")
    }

    fun disconnect(){
        println("Sayfa 47 = discconected from db")
    }
}

fun String.toLowercaseExtension(): String{
    return this.lowercase(Locale.getDefault())
}

fun logIn(
    username: String = "ananoymous42"
) {
    println("Sayfa 38 = $username just logged in")
}

data class Account(
    val id: Long,
    val name: String,
    val balance: Double
    )

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



