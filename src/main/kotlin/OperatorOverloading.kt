import kotlin.properties.Delegates

/**
 * Operator overloading is used to custom
 * implementations for a predefined set of operators on types.
 *
 * Such as plus, minus, inc, dec, unary minus, invoke, compareTo, ...
 *
 * */
class A(private val i : Int){

    var a : Int by Delegates.notNull()

    operator fun plus(a: A): A{
        return A(i + a.i)
    }

    operator fun plus(int : Int):A{
        return A(int + i)
    }

    override fun toString(): String {
        return i.toString()
    }
}

operator fun Int.plus(a : A) : A = a.plus(this)
//operator fun Int.plus(a : A) : A = A(this + a.i)