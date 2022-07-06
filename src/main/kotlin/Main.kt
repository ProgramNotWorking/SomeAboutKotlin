import java.util.*

val scanner = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)   // again
// we need use Locale to work with double more correct

fun main(args: Array<String>) {

    println("Hello world")  // yes
    print("Without /n")
//---//
    val hello = "Hello!" // val - const
    var world = "World"  // var - usual
//---//
    var someString: String   // just String
    var firstNumber: Int     // just int
    var secondNumber: Double // just double
//---//
    var someNumber = 10 // compiler will change someNumber to int
//---//
    val a = 10
    val b = 20
    println("$a + $b = ${a + b}")

    val name = "Thomas"
    println("Hello, my name is $name")
//---//
    // About Scanner
    val someIntNumber = scanner.nextInt()
    println("Ur number = $someIntNumber")
//---//
    print(scanner.hasNext())    // return true if we have some inputs still
    // return false if we don't have smt like this
//---//
    val inputNumber = scanner.nextInt()
    print(inputNumber * 10)
//---//
    val helloString = "Hello "
    val worldString = "world!"                  // Just join method
    val helloWorld = helloString + worldString  // helloWorld = "Hello world!"
//---//
    val randomString = "Again hello world"
    println(randomString.length)                // return length
//---//
    val somethingText = "Hello world"
    somethingText.substring(2, 5)   // return from 2 to 4 -> "llo"
    somethingText.substring(2..5)   // return from 2 to 5 -> "llo "
//---//
    // Some extra methods
    val againString = "Hello world"
    againString.substringAfter("l")      // return "lo world"
    againString.substringAfterLast("l")  // return "d"
    againString.substringBefore("l")     // return "He"
    againString.substringBeforeLast("l") // return "Hello wor"
//---//
    val takeString = "Hello"
    takeString.take(2)      // return 2 first symbols -> "He"
    takeString.takeLast(2)  // return 2 last symbols -> "lo"
    takeString.first()      // return first symbol -> "H"
    takeString.last()       // return last symbol -> "o"
//---//
    val nameStr = "Thomas"
    val ageStr = "19"
    println("Hello, my name is " + nameStr + ", i am " + ageStr + " years old")
    println("Hello, my name is $name, i am $ageStr years old")
//---//
    val numberA = 10
    val numberB = 20
    println("Sum = ${numberA + numberB}")   // return 30
//---//
    val numberAgain = 10
    val numberAgain2 = 20

    // incorrect:
    // print(a + " " + b)

    // correct:
    println("" + a + " " + b)

    // or:
    println("$a $b")
//---//
    val someBoolNumber = scanner.nextInt()
    val someAnotherBoolNumber = someBoolNumber > 10 // if someBoolNumber > 10 someAnotherBoolNumber = true
    println(someAnotherBoolNumber)      // => print("true") like String format
//---//
    val someIfNumber = scanner.nextInt()
    val someElseNumber = if (someIfNumber == 5) 1 else 0 // someElseNumber will be 1 if = true, else 0
//---//
    val someInNumber = 5
    println(someInNumber in 1..10) // will print 'true' if 5 <= someInNumber <= 10
//---//
    // when <=> switch-case
    val someWhenNumber = scanner.nextInt()

    when (someWhenNumber) {
        5, -5 -> {print("1")}       // 5, -5 <=> (a == 5 || a == -5)
        in 6..10 -> {print("2")}
        !in 0..5 -> {print("3")}
        else -> {print("Default")}  // else <=> default
    }
    // if we have more than 1 true condition, will work 1st of it

    // we can assign a value to a variable via when:
    var someWhen2Number = when(someWhenNumber) {
        5, -5 -> 5
        in 5..10 -> "This number from 5 to 10"
        else -> "We can put there string and int cuz that kotlin XD"
    }
//---//
    val someToStringNumber = 10
    print(someToStringNumber.toString())    // to String -> all easy
    // toInt(), toDouble() and more...
    // one more example:
    var someToStringNumber2 = "10".toInt()
//---//
    // Arrays and methods
    val someArray = intArrayOf(1, 2, 3, 4)
    val someArrayBoolean = booleanArrayOf(true, false, true, false)
    val someDifferentArray = Array<Int>(10) { 5 }   // we can write IntArray or Array<Int> -> pohuy)
    // 10 -> dimension of this array; 5 -> default meaning(like (5, 5, 5, 5...))

    someArray.set(1, 2) // -> someArray[1] = 2
    someArray.get(1) // -> someArray[1] (simple getter)

    val someArrayAgain = intArrayOf(1, 2, 3, 4)
    print(someArrayAgain.joinToString())    // <=> print("1, 2, 3, 4")

    var someArrayWithSort = intArrayOf(2, 4, -1, 6)
    someArrayWithSort.sort() // -> (-1, 2, 4, 6) => ascending sort
    someArrayWithSort.sortDescending() // -> (6, 4, 2, -1) => descending sort
    // that's cool rly

    someArrayAgain.reverse() // -> (1, 2, 3, 4) -> (4, 3, 2, 1)
//---//
    // About for()
    for(i in 1..10)
        print("$i ")    // will print i 10 times with new value

    val someForArray = intArrayOf(1, 2, 3, 4)
    for(i in someForArray) { print("$i ") } // will print 1, 2, 3, 4

    for(i in 10 downTo 1) { print("$i ") } // will print from 10 -> 1
    for(i in 1 until 10) { print("$i ") } // will print from 1 -> 9 (without 10)
    for(i in 0..10 step 2) { print("$i ") } // will print 0, 2, 4...10

    someForArray.forEach { print("$it ") }  // will print all elements of this array
    repeat(5) { print("Hello") } // will print 'Hello' 5 times in a row
//---//
    // While:
    val someWhileNumber = 10
    var someWhileNumber2 = 1

    // there is all standard
    while(someWhileNumber != someWhileNumber2) { someWhileNumber2++ }
    // or:
    do {
        someWhileNumber2++  // first will be carried out body, then check condition
    } while(someWhileNumber != someWhileNumber2)

    // imagine u have some strings in file or smt like this
    // then u can read this use 'while' and 'hasNext()':
    while(scanner.hasNext()) {
        // something there
    }
//---//
    // Break and continue:

    // break:
    for (i in 1..5) {
        if (i == 4)
            break
        print("$i ")
    }   // will print 1 2 3
    // continue:
    for (i in 1..5) {
        if (i == 4)
            continue
        print("$i ")
    }   // will print 1 2 3 5 (will skip i = 4)
//---//
    // Functions:
    val someFunctionNumber = scanner.nextInt()
    val someFunctionNumber2 = scanner.nextInt()
    print("Ur sum = ${twoNumberSum(someFunctionNumber, someFunctionNumber2)}")
//---//

}

fun twoNumberSum(firstNumber: Int, secondNumber: Int): Int {
    // if we need void function we don't need to write type
    return firstNumber + secondNumber
}
// one more example of this fun:
fun twoNumberSum2(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber