package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {

    val parentJob = launch {

        println("parent job started")
        val childJob = launch {
            try {

                println("child coroutines started")
                delay(3000)
                println("child coroutines completed")

            }catch (e:CancellationException){
                println("child coroutines cancelled:${e.message}")

            }
        }

        delay(1000)
        println("Parent is cancelling now...")
        this.cancel()
    }
    parentJob.join()
    println("Main program ends")

}