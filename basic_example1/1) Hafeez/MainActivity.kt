package com.codehafeez.basic_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ifElse_function(view: View)
    {
        val num = 10
        if (num > 0) {
            println("$num is positive")
        } else if (num < 0) {
            println("$num is negative")
        } else {
            println("$num is zero")
        }
    }

    fun switch_function(view: View)
    {
        // swtich example1
        val dayOfWeek = 3
        when (dayOfWeek) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            else -> println("Weekend")
        }

        // swtich example2
        val fruit = "apple"
        when (fruit) {
            "apple", "pear" -> println("Fruit is a type of pome")
            "orange", "lemon" -> println("Fruit is a type of citrus")
            else -> println("Fruit is unknown")
        }
    }

    fun loops_function(view: View)
    {
        // For loop
        val items = listOf("apple", "banana", "orange")
        for (item in items) {
            println(item)
        }


        // While loop
        var i = 0
        while (i < 5) {
            println(i)
            i++
        }


        // Do-while loop
        var j = 0
        do {
            println(j)
            j++
        } while (j < 5)



        // Range-based loop
        for (k in 1..5) {
            println(k)
        }
    }

    fun array1_function(view: View)
    {
        // 1d array example1
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val firstNumber = numbers[0] // firstNumber = 1
        numbers[3] = 10 // numbers = [1, 2, 3, 10, 5]
        for (number in numbers) {
            println(number)
        }



        // 1d array example2
        val names = arrayOf("Alice", "Bob", "Charlie", "David")
        val firstName = names[0] // firstName = "Alice"
        println(firstName)
        names[2] = "Charlie Brown" // names = ["Alice", "Bob", "Charlie Brown", "David"]
        for (name in names) {
            println(name)
        }



        // 1d array example3
        val mixed = arrayOf("Alice", 2, true, "Bob", 4, false)
        val firstElement = mixed[0] // firstElement = "Alice"
        val secondElement = mixed[1] // secondElement = 2
        val thirdElement = mixed[2] // thirdElement = true
        mixed[3] = "Charlie" // mixed = ["Alice", 2, true, "Charlie", 4, false]
        mixed[5] = true // mixed = ["Alice", 2, true, "Charlie", 4, true]
        for (element in mixed) {
            println(element)
        }


        // read array object in loop
        class Person(val name: String, val age: Int)
        val people = arrayOf(
            Person("Alice", 25),
            Person("Bob", 30),
            Person("Charlie", 35)
        )
        for (person in people) {
            println("${person.name} is ${person.age} years old")
        }
    }

    fun udf_function(view: View)
    {
        // function exmaple1
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
        val result = sum(3, 4)
        println(result) // Output: 7


        // function exmaple2
        fun greet(name: String = "world") {
            println("Hello, $name!")
        }
        greet() // Output: Hello, world!
        greet("Alice") // Output: Hello, Alice!
    }
}