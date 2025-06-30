package org.example

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {

        delay(1000)
        println("I am from Globalscope! ")
    }

    println("Main Thread Ends")
    Thread.sleep(1500)
}