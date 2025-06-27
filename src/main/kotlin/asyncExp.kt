package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val time = System.currentTimeMillis()
    val result1 = async { Task1() }
    val result2 = async { Task2() }

    val result = result1.await() + result2.await()
    val duration = System.currentTimeMillis() - time
    println("The final result is $result")
    println("Time taken to do the task $duration")
}

suspend fun Task1(): Int {

    delay(1000)
    println("Task 1 is completed")
    return 10
}

suspend fun Task2(): Int {
    delay(5000)
    println("Task 2 is completed")
    return 20
}