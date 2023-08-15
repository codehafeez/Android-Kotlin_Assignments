package com.codehafeez.basic_example2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun listOf_function(view: View)
    {
        val fruits = listOf("apple", "banana", "orange")
        println(fruits)
    }

    fun mutableListOf_function(view: View)
    {
        val names = mutableListOf("Alice", "Bob", "Charlie", "David", "Eva")
        names.add("Frank")
        names[3] = "Daniel"
        names.remove("Eva")
        names.removeAt(2)
        println(names) // prints [Alice, Bob, Daniel, Frank]
    }

    fun mapSet_function(view: View)
    {
        var ages = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)
        ages += ("Dave" to 40)
        ages -= "Bob"

        var uniqueNumbers = setOf(1, 2, 3, 4, 5, 3, 2)
        uniqueNumbers += 6
        uniqueNumbers -= 3

        println(ages)
        println(uniqueNumbers)
    }

    fun mutableMapOf_function(view: View)
    {
        var ages = mutableMapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)

        // add item
        ages["Dave"] = 40

        // update item
        ages["Alice"] = 50
        ages.put("Bob", 40)

        // delete item
        ages.remove("Charlie")
        println(ages)
    }

    fun mutableSetOf_function(view: View)
    {
        // example1 int
        var numbers = mutableSetOf(1, 2, 3, 4, 5)
        println(numbers)

        // add an item to the set
        numbers.add(6)

        // remove an item from the set
        numbers.remove(3)

        // check if an item is in the set
        println(numbers.contains(4))

        // print the size of the set
        println(numbers.size)

        // iterate over the set
        for (number in numbers) {
            println(number)
        }

        // example2 string
        var fruits = mutableSetOf("apple", "banana", "orange")
        println(fruits)

        // add an item to the set
        fruits.add("pear")

        // remove an item from the set
        fruits.remove("banana")

        // check if an item is in the set
        println(fruits.contains("orange"))

        // print the size of the set
        println(fruits.size)

        // iterate over the set
        for (fruit in fruits) {
            println(fruit)
        }


        // example3 mix (string & int)
        var set = mutableSetOf("apple", 2, "orange", 4, 5)
        println(set)

        // add an item to the set
        set.add("banana")

        // remove an item from the set
        set.remove(2)

        // check if an item is in the set
        println(set.contains("orange"))

        // print the size of the set
        println(set.size)

        // iterate over the set
        for (item in set) {
            println(item)
        }
    }

    fun linkedList_function(view: View)
    {
        val queue = LinkedList<String>()
        queue.add("Alice")
        queue.add("Bob")
        queue.add("Charlie")
        println(queue)

        // update an element
        queue[1] = "Bobby"
        println(queue)

        // remove an element
        queue.remove("Charlie")
        println(queue)
    }

    fun stack_function(view: View)
    {
        // example1 - int
        val stack = Stack<Int>()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        println(stack)

        // update an element
        stack[1] = 5
        println(stack)

        // remove an element
        val removedElement = stack.pop()
        println("Removed element: $removedElement")
        println(stack)


        // example2 - string
        val stack2 = Stack<String>()
        stack2.push("Alice")
        stack2.push("Bob")
        stack2.push("Charlie")
        println(stack2)

        // add a new element
        stack2.push("Dave")
        println(stack2)

        // update an element
        stack2[1] = "Bobby"
        println(stack2)

        // remove an element
        val removedElement2 = stack2.pop()
        println("Removed element: $removedElement2")
        println(stack2)


        // example3 - both (int, string)
        val stack3 = Stack<Any>()
        stack3.push("Alice")
        stack3.push(1)
        stack3.push("Bob")
        stack3.push(2)
        println(stack3) // prints: [Alice, 1, Bob, 2]
    }
}