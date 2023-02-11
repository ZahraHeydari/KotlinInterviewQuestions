import function.*
import operator.A
import operator.getAverage
import operator.plus

fun main(args: Array<String>) {
    onOperatorOverloading() //Q1
    println("====================")
    onInlineFunction() //Q2
    println("====================")
    onSpreadOperator() //Q3
    println("====================")
    onOverridingProperty() //Q4
    println("====================")
    onDestructingDeclaration() //Q5
    println("====================")
    println("abc".split("")) // Before running, guess what will be printed?
}

/**
 * Q1: Implement the body of class A
 * */
fun onOperatorOverloading() {
    val a1 = A(10)
    val a2 = A(2)
    println(a1 + a2) //prints 12
    println(a1 + 10) //prints 20
    println(10 + a1) //prints 20
}

/**
 * Q2: Write a function (dpToPx) that returns the different types of values
 * */
fun onInlineFunction() {
    val intValue: Int = dpToPx(64)
    println(intValue) //prints 128

    val floatValue: Float = dpToPx(64f)
    println(floatValue) //prints 128.0f
}

/**
 * Q3: Write a function that takes variable number of arguments
 * */
fun onSpreadOperator() {
    val result = getAverage(1, 2)
    println(result)

    val items = intArrayOf(1, 2, 3, 4)
    val res = getAverage(*items)
    println(res)
}

/**
 * Q4: As you see the child class extends the parent class.
 * What will be printed inside init block of the parent class? and why?!!!
 * */
fun onOverridingProperty() {
    Child()
}

open class Parent {
    open val foo = 1

    init {
        println(foo)
    }
}

class Child : Parent() {
    override val foo = 2
}

/**
 * Q5: Write the body of c function
 * */
fun onDestructingDeclaration() {
    //val (a, b) = c < d , e > (f) //here spaces are only for confusing!
    val f = 0
    val (a, b) = c<D, E>(f)
    println(a)
    println(b)
}