object MainKt {
    @JvmStatic
    fun main(args: Array<String>) {
        onOperatorOverloading()
        onInlineFunction()
        onSpreadOperator()
    }

    /**
     * Implement A class
     * */
    private fun onOperatorOverloading() {
        val a1 = A(10)
        val a2 = A(2)
        println(a1 + a2) //prints 12
        println(a1 + 10) //prints 20
        println(10 + a1) //prints 20
    }

    /**
     * Write a function that returns different types of values
     * */
    private fun onInlineFunction() {
        val intValue: Int = dpToPx(64)
        println(intValue) //prints 128
        val floatValue: Float = dpToPx(64f)
        println(floatValue) //prints 128f
    }

    private fun onSpreadOperator() {
        val result = getAverage(1, 2)
        println(result)
        val items = intArrayOf(1, 2, 3, 4)
        val res = getAverage(*items)
        println(res)
    }

    private fun getAverage(vararg items: Int): Double {
        return items.average()
    }
}