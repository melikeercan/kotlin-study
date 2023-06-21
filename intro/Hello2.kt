package intro

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Melike"
    println("Hello, $name")
}