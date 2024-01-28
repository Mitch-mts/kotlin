import java.time.LocalDate

val pi = getPiValue()
const val PI = 3.14
fun main(){
    var country: String
    var name = "mitch"
    var surname = "severa"
    val age = 28
    var city = "harare"
    country = "Zimbabwe"
    println("hello world " + name + " " + surname + " at age $age")
    println("my city is $city in " + country)
    println("pi reference is " + pi)
    println(surname[3])
    println("surname length is " + surname.length)
    println(surname.uppercase())
    println(name.lowercase())

    var a = 5
    var b = 6

    if (a < b) {
        println("" + a + " is less than " + b)
    } else if (a == b) {
        println("the values are equal")
    }else {
        println("" + a + " is greater than " + b)
    }

    val result = if (a == b) "the values are equal" else "the values are not equal"
    println(result)

    val day  = 5
    val resultDay = when(day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "invalid day"
    }
    println("when expression result $resultDay")

    var i = 0
    while(i < 3) {
        println(i)
        i++
    }

    var j = 1
    do {
        println("counter $j")
        j++
    } while (j<7)

    val cars = arrayOf("bmw", "benz", "mazda")
    println("favourite car in array of cars is " + cars[1])
    println("car array size " + cars.size)

    if("mazda" in cars) {
        println("car exists")
    } else {
        println("car doesn't exist")
    }

    for(x in cars) {
        println(x)
    }

    println("number line")
    for(numbers in 1..10) {
        println(numbers)
    }

    sunday()
    january("sunday", LocalDate.now().dayOfMonth)
    println("below is a funcation call that returns a value")
    var resultant = add(5)
    println("answer is " + resultant)
    println(wordOfToday())

    val myStrings = MyStrings()
    println(myStrings.display(myStrings.brand))
    println(myStrings.constructorDisplay())


    val inheritance = SubClass()
    inheritance.myFunction()

}

fun january(day: String, date: Int) {
    println("the day today is " + day + " the " + date + "th")
}

fun sunday() {
    println("today is a sunday")
}

fun add(num: Int): Int {
    return (num + 5)
}

fun wordOfToday(): String {
    return "sunday fun day"
}

fun getPiValue(): Double = PI
