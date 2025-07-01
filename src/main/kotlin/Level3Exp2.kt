package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {

    val supervisor = SupervisorJob()

    val scope = CoroutineScope(supervisor + Dispatchers.Default)

    scope.launch {
        println("Child 1 started")
        delay(1000)
        println("Child 1 throwing exception")
        throw RuntimeException("Child 1 failed!")
    }

    scope.launch {
        println("Child 2 started")
        delay(2000)
        println("Child 2 completed successfully")
    }

    delay(3000)
    println("Main done")
}