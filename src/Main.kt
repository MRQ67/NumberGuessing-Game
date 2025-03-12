import kotlin.random.Random

fun main() {
    val random = Random.nextInt(1,100)
    val guesses = 5
    var guessescount = 5
    var guess = 0
    var attempts = 0

    fun guessNumber() {
        println("Guess a number between 1 and 100!! You only have 5 Guess")
        print("Number: ")
        guess = readln().toInt()
        if (guess == random) {
            println("You win!")
        } else if (guess < random) {
            println("Too low")
            attempts++
            guessescount--
            println("You have $guessescount left")
        } else {
            println("Too high")
            attempts++
            guessescount--
            println("You have $guessescount left")

        }
    }

    while (guess != random && attempts < guesses) {
        guessNumber()
    }
    if (guessescount == 0) {
        println("You lose! The number was $random")
    } else {
        println("You win! The number was $random")
    }
}