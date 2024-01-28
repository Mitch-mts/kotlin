class MyClassConstructor(var brand: String,
                         var model: String,
                         var year: Int) {
    fun drive(): String {
        return "Wroom!"
    }

    fun speed(maxSpeed: Int) {
        println("max speed is $maxSpeed")
    }
}