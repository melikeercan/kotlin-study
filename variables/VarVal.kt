package variables

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun max2(a: Int, b: Int): Int = if(a > b) a else b

fun displayMax(a: Int, b: Int) {
    println(max2(a,b))
}

fun printer() {
    println(listOf(1,2,3).joinToString(separator = "", postfix = "."))
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun main() {
    displaySeparator(character = 'a', size = 5)
}

