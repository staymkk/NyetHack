package org.example

//import java.io.File

const val TAVERN_MASTER = "Tatooine"
const val TAVERN_NAME = "$TAVERN_MASTER's Folly"

private val firstNames = setOf(
    "Elara",
    "Kaelen",
    "Brynn",
    "Dorian",
    "Lyra",
    "Rurik",
    "Isolde",
    "Morgana",
    "Gandalf",
    "Merlin",
    "Sypha",
    "Conan",
    "Xena",
    "Ragnar",
    "Brienne",
    "Kratos",
    "Garrett",
    "Loki",
    "Carmen",
    "Robin"
)
private val lastNames = setOf(
    "Spellweaver",
    "Arcanum",
    "Mystborne",
    "Runecaster",
    "Stargazer",
    "Ironside",
    "Battlehorn",
    "Steelheart",
    "Warhammer",
    "Bloodaxe",
    "Quickfinger",
    "Shadowstep",
    "Silentstalk",
    "Nightshade",
    "Cleverhand"
)

//val menuData = File("src/main/resources/tavern-menu-data.txt")
//    .readText()
//    .split("\n")

//private val menuItems = List(menuData.size) { index ->
//    val (type, name, price) = menuData[index].split(",")
//    name
//}

fun visitTavern() {
    narrate(
        "$heroName enters $TAVERN_NAME",
        ::makeGreen
    )
    narrate("There are several items for sale:")
//    narrate(
//        menuItems.joinToString(),
//        ::makeBlue
//    )
menuOutput()

    val patrons: MutableSet<String> = mutableSetOf()
    repeat(10) {
        while (patrons.size < 10) {
            patrons += "${firstNames.random()} ${lastNames.random()}"
        }
    }

//    for (patron in patrons){
//        println("Good evening, $patron")
//    }

//    patrons.forEachIndexed { index, patron ->
//        println("Good evening, $patron - you're #${index + 1} in line")
//        placeOrder(patron, menuItems.random())
//    }

    narrate("$heroName sees several patrons in the tavern:")
    narrate(patrons.joinToString())

    repeat(3) {
        placeOrder(patrons.random(), menuItems.random())
    }
}

fun placeOrder(patronName: String, menuItemName: String) {
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