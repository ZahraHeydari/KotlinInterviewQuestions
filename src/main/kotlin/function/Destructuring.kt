package function

class D {}

class E {}

fun <T1, T2> c(f: Any): Pair<Any, Any> {
    return f to f //this return value (f to f) is just an example here!
}

