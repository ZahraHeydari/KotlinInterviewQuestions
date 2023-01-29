package function

/**
 * When use 'inline' keyword for a function, the code of that function
 * will be copied and pasted wherever the function is called.
 *
 * it reduces memory overhead allocation but increases the resulting bytecode!
 * so inline keyword usage should be avoided for the large functions.
 *
 * */
inline fun <reified T> dpToPx(dp: T): T {
    return when (T::class) {
        Int::class -> {
            val px = (dp as Int) * 2
            px as T
        }
        Float::class -> {
            val px = (dp as Float) * 2
            px as T
        }
        else -> throw IllegalArgumentException("Unsupported Cast")
    }
}