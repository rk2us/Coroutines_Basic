package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
 val job = launch {
     try {

         println("start calculation")
         val result = divideNumbers(7,2)
         println("Result : ${result}")

     }catch (a:ArithmeticException){
         println("Error: Cannot divide by zero  ${ a.message}")

     }catch (e:Exception){
         println("Unknown error :${e.message}")
     }
 }
    job.join()
    println("Main finished")

}
suspend fun divideNumbers(a:Int,b:Int):Int{
    delay(5000)
    return a/b
}