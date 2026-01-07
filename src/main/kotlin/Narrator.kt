package org.example

fun narrate(
    message: String
){
    val narrationModifier:()-> String = {
        val numExclamationPoints = 3
        message.uppercase() + "!".repeat(numExclamationPoints)
    }
    println({
        val numExclamationPoints = 3
        message.uppercase() + "!".repeat(numExclamationPoints)
    }())
    println(narrationModifier())
}