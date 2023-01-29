import operator.A
import function.dpToPx
import operator.getAverage
import operator.plus

fun main(args: Array<String>) {
    onOperatorOverloading()
    println("====================")
    onInlineFunction()
    println("====================")
    onSpreadOperator()
}

/**
 * Q1: implement the body of class A
 * */
fun onOperatorOverloading() {
    val a1 = A(10)
    val a2 = A(2)
    println(a1 + a2) //prints 12
    println(a1 + 10) //prints 20
    println(10 + a1) //prints 20
}

/**
 * Q2: write a function that returns the different types of values
 * */
fun onInlineFunction() {
    val intValue: Int = dpToPx(64)
    println(intValue) //prints 128

    val floatValue: Float = dpToPx(64f)
    println(floatValue) //prints 128.0f
}

/**
 * Q3: write a function that takes variable number of arguments
 * */
fun onSpreadOperator() {
    val result = getAverage(1, 2)
    println(result)

    val items = intArrayOf(1, 2, 3, 4)
    val res = getAverage(*items)
    println(res)
}