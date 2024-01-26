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

    val result = if (a == b) "the values are equal" else "the values are not equals"
    println(result)
}

fun getPiValue(): Double = PI
