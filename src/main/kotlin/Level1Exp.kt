package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job=launch {
        println("Hello from coroutines thread: ${Thread.currentThread().name}  ")
        delay(1000)
        println("Coroutine work done")
    }
    job.join()

    task1()




}


suspend fun task1(){
    println("Downloading data....")
    delay(2000)
    println("Downloading complete....")
}