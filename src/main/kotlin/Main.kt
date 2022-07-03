import java.util.*

val scanner  = java.util.Scanner(System.`in`)   //Again

fun main(args: Array<String>) {

    println("Hello world")  //yes
    print("Without /n")
//---//
    val hello = "Hello!" //val - const
    var world = "World"  //var - usual
//---//
    var someString: String   //just String
    var firstNumber: Int     //just int
    var secondNumber: Double //just double
//---//
    var someNumber = 10 //compiler will change someNumber to int
//---//
    val a = 10
    val b = 20
    println("$a + $b = ${a + b}")

    val name = "Thomas"
    println("Hello, my name is $name")
//---//
    //About Scanner
    val someIntNumber = scanner.nextInt()
    println("Ur number = $someIntNumber")
//---//
    print(scanner.hasNext())    //return true if we have some inputs still
                                //return false if we don't have smt like this
//---//
    val inputNumber = scanner.nextInt()
    print(inputNumber * 10)
//---//
    val helloString = "Hello "
    val worldString = "world!"                  //Just join method
    val helloWorld = helloString + worldString  //helloWorld = "Hello world!"
//---//
    val randomString = "Again hello world"
    println(randomString.length)                //return length
//---//
    val somethingText = "Hello world"
    somethingText.substring(2, 5)   //return from 2 to 4 -> "llo"
    somethingText.substring(2..5)   //return from 2 to 5 -> "llo "
//---//
    //Some extra methods
    val againString = "Hello world"
    againString.substringAfter("l")      //return "lo world"
    againString.substringAfterLast("l")  //return "d"
    againString.substringBefore("l")     //return "He"
    againString.substringBeforeLast("l") //return "Hello wor"
//---//
    val takeString = "Hello"
    takeString.take(2)      //return 2 first symbols -> "He"
    takeString.takeLast(2)  //return 2 last symbols -> "lo"
    takeString.first()      //return first symbol -> "H"
    takeString.last()       //return last symbol -> "o"
//---//
    val nameStr = "Thomas"
    val ageStr = "19"
    println("Hello, my name is " + nameStr + ", i am " + ageStr + " years old")
    println("Hello, my name is $name, i am $ageStr years old")
//---//
    val numberA = 10
    val numberB = 20
    println("Sum = ${numberA + numberB}")   //return 30
//---//
    val numberAgain = 10
    val numberAgain2 = 20

    //incorrect:
    //print(a + " " + b)

    //correct:
    println("" + a + " " + b)

    //or:
    println("$a $b")
//---//
    val someBoolNumber = scanner.nextInt()
    val someAnotherBoolNumber = someBoolNumber > 10 //if someBoolNumber > 10 someAnotherBoolNumber = true
    println(someAnotherBoolNumber)      // => print("true") like String format
//---//
    val someIfNumber = scanner.nextInt()
    val someElseNumber = if (someIfNumber == 5) 1 else 0 //someElseNumber will be 1 if = true, else 0
//---//
    val someInNumber = 5
    println(someInNumber in 1..10) //will print 'true' if 5 <= someInNumber <= 10
//---//


}