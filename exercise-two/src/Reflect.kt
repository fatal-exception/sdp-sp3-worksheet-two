import java.lang.reflect.Constructor
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.cast
import kotlin.reflect.full.createInstance

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Requires a class name and a list of arguments")
        System.exit(-1)
    }

    val className: String = args[0]
    val classParams: List<String> = args[1].split(",")

    val k: KClass<out Any> = Class.forName(className).kotlin
    val c: Class<*> = Class.forName(className)
    val f: KFunction<Any> = k.constructors
            .first { it.parameters.size == classParams.size }
//    val cons: Constructor<Party> = c.getConstructor(String.class, String.class)
    val numOfPeople = classParams[0].toInt()
    val occasion = classParams[1]
    val location = classParams[2]
    val o: Any? = f.call(numOfPeople, occasion, location)
}
