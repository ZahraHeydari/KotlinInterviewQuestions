# Kotlin Interview Questions

Here in this repository, I will be sharing some top Kotlin interview questions which are asked in many Interviews. So,
if you are preparing for Android interviews, then this collection may help you a lot.

To make it short and simple without reducing the number of questions, I have put the link of answers to every question.

### Q1. How does Kotlin work on Android?
**Short answer:** Just like Java, the Kotlin code is also compiled into the Java bytecode and is executed at runtime 
by the Java Virtual Machine.

For more [read this link](https://kotlinlang.org/docs/android-overview.html)

### Q2. Why should we use Kotlin?
**Short answer:** Kotlin is
- statically typed programming language
- interoperable with the Java programming language 
- concise
- null-safe

Other features including smart casting, higher-order functions, extension functions and lambdas with receivers 
provide the ability to write expressive code as well as facilitating creation of DSL.

### Q3. What is the difference between 'const' and 'val'?
**Short answer:** The value of const variable is assigned during compile time, unlike the val variable,
where it can be done at runtime.
This means, const variables can never be assigned to a function or any class constructor, 
but only to a String or primitive. For more [read this link](https://blog.mindorks.com/what-is-the-difference-between-const-and-val)

### Q4. What is Null Safety in Kotlin?
**Short answer:** It refers to the ability of variables to have an absence of value.
In Kotlin, nullability is intentionally treated to achieve null safety. 
For more [read this link](https://kotlinlang.org/docs/null-safety.html)

### Q5. What is Elvis operator in Kotlin?
**Short answer:** Elvis operator is used to return the not null value even the conditional expression is null. 
It is also used to check the null safety of values. For more [read this link](https://kotlinlang.org/docs/null-safety.html#elvis-operator)

### Q6. What is Null Check operator in Kotlin?
**Short answer:** You can use the Null Check operator in Kotlin to check if the value of a variable is NULL. 
It can only be used when we are sure that we are refereeing to a non-NULL able value. 
For more [read this link](https://kotlinlang.org/docs/null-safety.html#safe-calls)

### Q7. What is Not Null Assertion operator in Kotlin?
**Short answer:** The not-null assertion operator in Kotlin throws a Kotlin NullPointerException if the variable to which it is applied is null.
This operator changes any reference to its non-nullable type and throws an exception if the reference has a null value. 
For more [read this link](https://kotlinlang.org/docs/null-safety.html#the-operator)

### Q8. What are Safe Casts in Kotlin?
**Short answer:** Kotlin Safe cast operator provides a safe cast operator for safely cast to a type. 
It returns a null if casting is not possible rather than throwing an ClassCastException exception. 
For more [read this link](https://kotlinlang.org/docs/null-safety.html#safe-casts)

### Q9. Does Kotlin have primitive data types?
**Short answer:** In Kotlin we do not have primitives. Actually, we have, but not out of the box. We cannot create primitive directly, at code level.
Kotlin, will convert primitive wrappers to primitive, whenever possible. 
For more [read this link](https://medium.com/@przemek.materna/kotlin-is-not-primitive-primitives-in-kotlin-and-java-f35713fda5cd)

### Q10. What is Data Class in Kotlin?
**Short answer:** Data class is a simple class which is used to hold data/state and contains standard functionality.
For more [read this link](https://kotlinlang.org/docs/data-classes.html)

### Q11. What is Property in Kotlin?
**Short answer:** Variable having a class level scope which is declared inside the class and outside the methods or functions is called as Property in Kotlin.
Properties in Kotlin classes can be either declared as mutable, using 'var' keyword or as immutable, read-only,  using 'val' keyword.
For more [read this link](https://kotlinlang.org/docs/properties.html#declaring-properties)

### Q12. What are Backing Fields?
**Short answer:** A Backing field is generated for a property only if it uses the default implementations of 
at least one of its accessors or the custom accessor references it through the field identifier. 
(The field identifier only can be used in the accessors!)
For more [read this link](https://medium.com/@nomanr/backing-field-in-kotlin-explained-9f903f27946c)

### Q13. What are Backing Properties?
**Short answer:** Backing field allows us to access a field of the property only in the scope of getter and setter. 
Using backing property we can access the field directly even in the most sophisticated manner.
For more [read this link](https://kotlinlang.org/docs/properties.html#backing-properties)

### Q14. Is Overriding properties supported in Kotlin?
**Short answer:** This is allowed because a val property essentially declares a get method, and overriding it as a var additionally declares a set method in the derived class.
For more [read this link](https://kotlinlang.org/docs/inheritance.html#overriding-properties)

### Q15. What are Delegated properties?
**Short answer:** Delegated property as the name suggests, is a property that delegates its getter and its setter to another property (a class). 
To prevent the duplication of code or just encapsulate the logic of the functions (getter and setter), we can use delegated properties. 
We can also create custom getters and setters.
For more [read this link](https://kotlinlang.org/docs/delegated-properties.html)

### Q16. What are Lazy properties?
**Short answer:** lazy is a function that takes a lambda and returns an instance of lazy which 
can serve as a delegate of lazy properties upon which it has been applied.

### Q17. What are Observable properties?
**Short answer:** Implements the core logic of a property delegate for a read/write property that calls callback functions when changed.

### Q18. Is Storing properties in a variable supported in Kotlin?
**Short answer:** One common use case is storing the values of properties in a map. This comes up often in applications for things like parsing JSON or performing other dynamic tasks. In this case, you can use the map instance itself as the delegate for a delegated property.
For more [read this link](https://kotlinlang.org/docs/delegated-properties.html)

### Q19. What are Enum classes?
**Short answer:** Enums are special classes which limit the possible values of an object for that class. The possible values defined for that class are final or unchangeable.
For more [read this link](https://kotlinlang.org/docs/enum-classes.html)

### Q20. What are Sealed classes?
**Short answer:** Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance. 
All direct subclasses of a sealed class are known at compile time. No other subclasses may appear outside the module and package within which the sealed class is defined.
For more [read this link](https://kotlinlang.org/docs/sealed-classes.html)

### Q21. What is the difference between Sealed class and Sealed interface?
**Short answer:** The main difference between sealed classes and sealed interfaces is that sealed classes can be subclassed, 
while sealed interfaces can be implemented by classes. Sealed interfaces, just like sealed classes, 
can only be implemented within the same file. Sealed interfaces cannot be implemented in other files, even if they are part of the same module.
For more [read this](https://medium.com/geekculture/idiomatic-kotlin-sealed-classes-and-sealed-interfaces-in-2021-79009d82c6ff)

### Q22. What is inline function? When to use? What are its advantages?
**Short answer:** The inline function tells the compiler to copy parameters and functions to the call site. 
The virtual function or local function cannot be declared as inline.
For more [read this](https://amitshekhar.me/blog/inline-function-in-kotlin)

### Q23. What is crossinline modifier? When to use? How does it work?
**Short answer:** It forbids non-local returns in a lambda passed to an inline function.
For more [read this](https://amitshekhar.me/blog/crossinline-in-kotlin)

### Q24. Difference between companion object and object classes
**Short answer:** The main difference is The companion object is instantiated for the first time as soon as the containing class is loaded. 
It means that it is instantiated even if we have not used the companion object. Whereas the object is instantiated lazily when we access it for the first time.
For more [read this](https://amitshekhar.me/blog/companion-object-in-kotlin)


### Q25. Difference between lateinit and lazy properties
**Short answer:** lateinit can only be used with a var property whereas lazy will always be used with val property. 
A lateinit property can be reinitialised again and again as per the use whereas the lazy property can only be initialised once.
For more [read this](https://amitshekhar.me/blog/lateinit-vs-lazy-in-kotlin)

### Q26. What are contracts in kotlin?
**Short answer:** Kotlin Contracts are a new experimental feature introduced in Kotlin 1.3. 
The main purpose of contracts is to help the Kotlin compiler with complicated code analysis in cases where the developer 
knows more details about the code than the compiler can see.
For more [read this](https://pspdfkit.com/blog/2018/kotlin-contracts/)

### Q27. When to use destructuring declarations?
**Short answer:** You can use the destructuring declarations syntax for lambda parameters. If a lambda has a parameter of the Pair type
(or Map. Entry , or any other type that has the appropriate componentN functions), 
you can introduce several new parameters instead of one by putting them in parentheses: map.
For more [read this link](https://kotlinlang.org/docs/destructuring-declarations.html)

### Q28. When does the init block get called in Kotlin?
**Short answer:** The code inside the init block is the first to be executed when the class is instantiated.
The init block is run every time the class is instantiated, with any kind of constructor as we shall see next.
For more [read this link](https://amitshekhar.me/blog/init-block-in-kotlin)

### Q29. What is a noinline in Kotlin? When to use it?
**Short answer:** If we don't want all the lambdas passed to an inline function to be inlined, mark some of your function parameters with the noinline modifier
For more [read this link](https://amitshekhar.me/blog/noinline-in-kotlin)

### Q30. What is the difference between == and === in Kotlin?
**Short answer:** "==" is used for structural equality, whereas "===" is used for referential equality.
For more [read this link](https://amitshekhar.me/blog/structural-and-referential-equality-in-kotlin)

### Q31. How would you create Singleton classes in Kotlin?
**Short answer:** Using the Singleton Pattern
For more [read this link](https://blog.mindorks.com/how-to-create-a-singleton-class-in-kotlin)

### Q32. What are high order function? List some cons of using high order functions.
**Short answer:** High order function (Higher level function) is a function which accepts function as a parameter or returns a function or can do both.
Means, instead of passing Int, String, or other types as a parameter in a function we can pass a function as a parameter in other function.
For more [read this link](https://kotlinlang.org/docs/lambdas.html)

### Q33. What is async?
**Short answer:** Kotlin's approach to working with asynchronous code is using coroutines, which is the idea of suspendable computations,
i.e. the idea that a function can suspend its execution at some point and resume later on.
For more [read this link](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/async.html)

### Q34. What is meant by Kotlin Generics?
**Short answer:** Generics are the powerful features that allow to define classes, methods, and properties etc. which can be accessed using different types.
For more [read this link](https://www.baeldung.com/kotlin/generics)

### Q35. State the types of constructors in Kotlin.
**Short answer:** In Kotlin, there are two constructors:
1. Primary constructor - concise way to initialize a class.
2. Secondary constructor - allows you to put additional initialization logic.

For more [read this link](https://kotlinlang.org/docs/classes.html#constructors)

### Q36. List benefits of Kotlin over Java.
**Short answer:** Kotlin is
- statically typed programming language
- interoperable with the Java programming language
- concise
- null-safe

Other features including smart casting, higher-order functions, extension functions and lambdas with receivers
provide the ability to write expressive code as well as facilitating creation of DSL.
For more [read this link](https://www.baeldung.com/kotlin/java-vs-kotlin)

### Q37. What is "When" block in Kotlin, Where it is used?
**Short answer:** when block is essentially an advanced form of the switch-case statement known from Java. 
In Kotlin, if a matching case is found, only the code in the respective case block is executed, 
and execution continues with the next statement after when block.
For more [read this link](https://www.baeldung.com/kotlin/when)