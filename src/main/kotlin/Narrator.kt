package org.example

import kotlin.random.Random
import kotlin.random.nextInt

val narrationModifier={ message:String ->
    val numExclamationPoints = 3
    message.uppercase() + "!".repeat(numExclamationPoints)
}

fun narrate(
    message: String
){
   val narrationModifier: ()-> String={
       val numExclamationPoints = 3
       message.uppercase() + "!".repeat(numExclamationPoints)
    }
    println(narrationModifier())
}