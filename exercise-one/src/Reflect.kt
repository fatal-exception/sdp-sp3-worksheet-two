import kotlin.reflect.KClass

class Dog {
    fun bark() = println("Woof!")
}

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Requires a class name as argument to program")
        System.exit(-1)
    }
    val c: Class<*> = Class.forName(args[0])
    val k: KClass<*> = Class.forName(args[0]).kotlin
    c.methods.forEach { println(it) }
    k.constructors.forEach { println(it) }

}
