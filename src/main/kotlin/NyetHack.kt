package org.example

fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?")
        {message->
            //Выводит сообщение желтым цветом
            "\u001b[33;1m$message\u001b[0m"
        }
    val heroName = readLine()
    require(heroName!=null&&heroName.isNotEmpty()){
        "Hero name cannot be empty"
    }

    changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
}

private fun createTitle(name :String):String{
    return when{
        name.count{it.lowercase()in "aeiou"}>4->"The Master of Vowel"
else->"The Renowned Hero"
    }
}