package org.example

fun makeYellow(message:String)="\u001b[33;1m$message\u001b[0m"

fun createTitle(name :String):String{
    return when{
        name.all{it.isDigit()} -> "The Identifiable"
        name.none{it.isLetter()} -> "The Witness Protection Member"
        name.count{it.lowercase()in "aeiou"}>4->"The Master of Vowel"
        else->"The Renowned Hero"
    }
}