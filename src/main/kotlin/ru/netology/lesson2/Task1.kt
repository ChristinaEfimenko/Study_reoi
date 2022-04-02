package ru.netology.lesson2

fun main() {
    val amount = getTransferAmount(10000)
    println("Комиссия составляет $amount копеек.")
}

/**
 * @param initialAmount - amount in rubles before commission.
 * @return amount in rubles with pennies after commission.
 */
fun getTransferAmount(initialAmount: Int): Int {
    val initialAmountPenny = initialAmount * 100
    val minCommission = 3500
    val commission = (initialAmountPenny / 400 * 3)
    return if (commission > minCommission) commission
    else minCommission
}
