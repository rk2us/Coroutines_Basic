package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
val time  = measureTimeMillis {
    val r1 = async { task2() }

    val r2 = async { task2() }

    println("Result : ${r1.await()},${r2.await()}")

}
    println("Total time: $time ms")
}

suspend fun task2():String{

    delay(1000)
  return "Return from Task2"
}

suspend fun task3():String{

    delay(1000)
    return "Return from Task3"
}