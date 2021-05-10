import java.util.*
import javax.print.attribute.IntegerSyntax
import kotlin.math.roundToInt

fun main() {
    var comission: Int = 0;
    println("________________________________________")

    while (true) {

        println("Enter the amount of rubles you want to transfer. If you have finished translating, enter 0")
        var amount = Integer.parseInt(readLine()) * 100;
        if (amount == 0) {
            println("Transfer close!")
            break
        }
        if (amount < 3500) {
            println("The amount of the commission exceeds the transfer amount. Please enter a higher value for translation.")
            continue
        }
        if ((amount / 100) * 0.75 > 3500) {
            comission = ((amount / 100) * 0.75).roundToInt()
        } else comission = 3500
        println("The commission for the transfer of " + amount / 100 + " rubles ($amount copeecs) is " + comission / 100 + " rubles ( $comission copeecs). Thank you for using the services of our service.")

    }


}