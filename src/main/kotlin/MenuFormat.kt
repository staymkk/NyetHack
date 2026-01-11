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

val menuAllTypes = List(menuData.size) { index ->
    val (type, name, price) = menuData[index].split(",")
    type
}

val menuTypes = menuAllTypes.distinct()
//fun findLongestName() {
//val maxLength = menuItems.maxOf { it.length }
//println (maxLength)
//}

fun menuOutput() {
    println("***Welcome to $TAVERN_NAME***")

    val namesForMenu = menuItems
        .map { name ->
            name.padEnd(30, '.')
        }

    val namesAndPriceForMenu = namesForMenu.mapIndexed { index, item ->
        ("${namesForMenu[index]} ${menuPrice[index]}")
    }

//    println(menuTypes)
//    println(namesAndPriceForMenu)
//    groupedByType.forEach { (type, items) ->
//        println("=== $type ===")
//        items.forEach { (_, name, price) ->
//            println("  $name $price gold")
//        }
//    }
//}
    val itemsWithTypes = List(menuData.size) { index ->
        val (type, _, _) = menuData[index].split(",")
        Triple(type, namesAndPriceForMenu[index], menuPrice[index])
    }

    val groupedByType = itemsWithTypes.groupBy { it.first }

    menuTypes.forEach { type ->
        val itemsInCategory = groupedByType[type] ?: emptyList()

        println("  ~[$type]~")
        itemsInCategory.forEach { (_, formattedItem, _) ->
            println(formattedItem)
        }
    }
}
