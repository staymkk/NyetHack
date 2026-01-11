package org.example

import java.io.File

private const val TAVERN_MASTER = "Tatooine"
private const val TAVERN_NAME = "$TAVERN_MASTER's Folly"

private val menuData = File("src/main/resources/tavern-menu-data.txt")
    .readText()
    .split("\n")

private val menuItems = List(menuData.size) { index ->
    val (type, name, price) = menuData[index].split(",")
    name
}

fun visitTavern() {
    narrate(
        "$heroName enters $TAVERN_NAME",
        ::makeGreen
    )
    narrate("There are several items for sale:")
    println(menuItems)

    val patrons = mutableListOf("Eli", "Mordoc", "Sophie")
    val readOnlyPatrons = patrons.toList()
//    println(patrons[0])

    val eliMessage = if (patrons.contains("Eli")) {
        "$TAVERN_MASTER says: Eli's in the back playing cards"
    } else {
        "$TAVERN_MASTER says: Eli isn't here"
    }
    println(eliMessage)

    val othersMessage = if (patrons.containsAll(listOf("Sophie", "Mordoc"))) {
        "$TAVERN_MASTER says: Mordoc and Sophie are seated by the stew kettle"
    } else {
        "$TAVERN_MASTER says: Sophie and Mordoc aren't with each other right now"
    }
    println(othersMessage)
    narrate("Eli leaves the tavern")
    patrons.remove("Eli")
    narrate("Alex enters the tavern")
    patrons.add("Alex")
    narrate("Alex (VIP) enters the tavern")
    patrons.add(0, "Alex")
    patrons[0] = "Alexis"

//    for (patron in patrons){
//        println("Good evening, $patron")
//    }

    patrons.forEachIndexed { index, patron ->
        println("Good evening, $patron - you're #${index + 1} in line")
        placeOrder(patron, menuItems.random())
    }
}

private fun placeOrder(patronName: String, menuItemName: String) {
    narrate(
        "$patronName speaks with $TAVERN_MASTER to place an order",
        ::makeGreen
    )
    narrate(
        "$TAVERN_MASTER hands $patronName a $menuItemName",
        ::makeGreen
    )

//    menuData.forEachIndexed { index, data ->
//        println("$index: $data")
//    }
}