package org.example

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {

    try {
        withTimeout(1000) {
            println("Task started...")
            delay(3000)
            println("Task completed")
        }
    } catch (e: TimeoutCancellationException) {
        println(" Timed out!")
    }
}