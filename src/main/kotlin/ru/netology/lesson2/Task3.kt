package ru.netology.lesson2

import org.json.JSONObject

fun main() {
    val customer = JSONObject().apply {
        put("name", "Vasiliy Pupkin")
        put("regular", true)
        put("purchasesVolume", 10005)
    }
    val amount = getFinalAmount(42753, customer)
    println("Комиссия составляет $amount.")
}

/**
 * @param amount - amount in rubles before discount.
 * @param customer - JO with customer's purchase info.
 * @return amount in rubles with pennies after discount.
 */
fun getFinalAmount(amount: Int, customer: JSONObject): String {
    var finalAmount = amount.toDouble()
    val customerPreviousPurchases = customer.getInt("purchasesVolume")
    if (customerPreviousPurchases in 1001..10000) {
        finalAmount -= 100
    } else if (customerPreviousPurchases > 10000) {
        finalAmount = (finalAmount * 0.95)
    }
    if (customer.getBoolean("regular")) {
        finalAmount = (finalAmount * 0.99)
    }
    val outputResult = finalAmount.toString().split(".")
    return "${outputResult[0]} рублей ${outputResult[1].substring(0, 2)} копеек"
}
