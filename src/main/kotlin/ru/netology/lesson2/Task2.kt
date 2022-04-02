package ru.netology.lesson2

fun main() {
    println(getRightVariant(2))
}

fun getRightVariant(peopleNumber: Int): String {
    return if (peopleNumber.toString().endsWith("1") && !peopleNumber.toString().endsWith("11"))
        "Понравилось $peopleNumber человеку" else "Понравилось $peopleNumber людям"
}
