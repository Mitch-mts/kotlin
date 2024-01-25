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
}

fun getPiValue(): Double = PI
