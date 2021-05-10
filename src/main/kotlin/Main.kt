import java.util.*
import javax.print.attribute.IntegerSyntax
import kotlin.math.roundToInt

fun main() {
    var comission: Double = 0.0;
    println("________________________________________")

    while (true) {

        println("Enter the amount of rubles you want to transfer. If you have finished translating, enter 0.0")
        val amount = readLine()!!.toDouble() * 100;
        if (amount == 0.0) {
            println("Transfer close!")
            break
        }
        if (amount < 0.0) {
            println("The amount must be more than 0. Please enter a higher value for translation.")
            continue
        }
        if ((amount / 100) * 0.75 > 3500) {
            comission = (amount / 100) * 0.75
        } else comission = 3500.00
        println("The commission for the transfer of " + String.format("%.2f", amount / 100) + " rubles (" + amount.toInt() + " copeecs) is " + String.format("%.2f", comission / 100) + " rubles (" + comission.toInt() + " copeecs). Thank you for using the services of our service.")

    }


}