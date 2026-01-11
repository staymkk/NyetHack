package org.example

var heroName: String = ""

fun main() {

    heroName = promptHeroName()
    //changeNarratorMood()
    narrate(
        "$heroName, ${createTitle(heroName)}, heads to the town square",
        ::makeBlue
    )
    visitTavern()
//    findLongestName()
}

private fun promptHeroName(): String {

    narrate(
        "A hero enters the town of Kronstadt. What is their name?",
        ::makeYellow
    )

    /*val input = readLine()

require(input != null && input.isNotEmpty()) {

"The hero must have a name."

}

return input*/

    println("Madrigal")
    return "Madrigal"
}