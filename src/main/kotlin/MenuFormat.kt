package org.example

import java.io.File

val menuData = File("src/main/resources/tavern-menu-data.txt")
    .readText()
    .split("\n")

val menuItems = List(menuData.size) { index ->
    val (type, name, price) = menuData[index].split(",")
    name
}

val menuPrice = List(menuData.size) { index ->
    val (type, name, price) = menuData[index].split(",")
    price
}

//fun findLongestName() {
//val maxLength = menuItems.maxOf { it.length }
//println (maxLength)
//}

fun menuOutput() {
    println("***Welcome to $TAVERN_NAME***")

    val namesMenu = menuItems
        .map { name ->
            name.padEnd(30, '.')
        }

    namesMenu.forEachIndexed { index, item ->
        println("${namesMenu[index]} ${menuPrice[index]}")
    }
}
