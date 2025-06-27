package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("Main starts")
    launch {
        println("Coroutines started on ${Thread.currentThread().name} and Thread id is ${Thread.currentThread().id}")
        delay(5000)
        println("Coroutines finished ")
    }

    println("Main Ends")
}