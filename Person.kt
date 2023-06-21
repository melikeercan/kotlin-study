class Person(val name: String, val age: Int) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) //static method
        {
            println("Static method")
            val person = Person("name", 0)
            println(person.name)
        }
    }
}
