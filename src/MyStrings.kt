class MyStrings {
    var brand = "mercedes benz"

    fun display(word: String): String {
        return word.uppercase()
    }

    fun constructorDisplay() {
        val result = MyClassConstructor("honda", "fit", 2003)
        println(result.drive())
        println(result.speed(200))
        println("my car is a " + result.brand + " " + result.model + " and its a " + result.year + " version")
    }
}