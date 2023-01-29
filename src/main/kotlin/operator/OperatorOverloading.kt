package operator

/**
 * Operator overloading is used to custom
 * implementations for a predefined set of operators on types.
 *
 * Such as plus, minus, inc, dec, unary minus, invoke, compareTo, ...
 *
 * */
class A(val i: Int) {

    operator fun plus(a: A): Int {
        return i + a.i
    }

    operator fun plus(int: Int): Int {
        return i + int
    }
}

operator fun Int.plus(a: A) = this + a.i