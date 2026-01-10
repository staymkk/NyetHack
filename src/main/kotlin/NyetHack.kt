package org.example

fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?",
        ::makeYellow)

    val heroName = readLine()
    require(heroName!=null&&heroName.isNotEmpty()){
        "Hero name cannot be empty"
    }

    changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
}
