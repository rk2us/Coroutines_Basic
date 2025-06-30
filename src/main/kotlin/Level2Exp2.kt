package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job1= launch {

        delay(1000)
        println("job 1 done")
    }

    val job2= launch {

        delay(1000)
        println("job 2 done")
    }

    val job3= launch {

        delay(1000)
        println("job 3 done")
    }
    job1.join()
    job2.join()
    job3.join()
    println("All work done")
}