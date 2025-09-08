fun main() {

    /*
        I've implement a mutable variable (var) with an initial value of empty string to overwrite for future cases
    */
    var computerChoice = ""
    var playerChoice = ""

    // I've print initial information to the console / user to pick 1 of 3 choices available,
    // and then I've implement a user input function (readln()) so user can input the choice that user picks,
    // and then i convert the input to lowercase for corner case to prevent case-sensitive
    println("Rock, Paper, Scissors? Enter you choice")
    playerChoice = readln().lowercase()

    // I also check or validate user input if the user entered different or typo of the 3 choices
    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Choose the right option!! (Rock, Paper, Scissors)")
        playerChoice = readln()
    }


    // I've created a new variable called randomNumber which will generate computer choice randomly from 1 to 3
    val randomNumber = (1..3).random()

    // and then i use when statement to assign computerChoice based on the random number
    /*
        The computer's choice is decided randomly using the random number we generated above.
        randomNumber will always be between 1 and 3 (inclusive).
        We map each number to one of the three possible choices:
            1 -> "rock"
            2 -> "paper"
            3 -> "scissors"
        This ensures the computer picks fairly at random every time the game runs.
    */
    when (randomNumber) {
        1 -> computerChoice = "rock"
        2 -> computerChoice = "paper"
        3 -> computerChoice = "scissors"
    }

    // we print the computerChoice so the user can see what computer choose
    println(computerChoice)

    // and then we determine the winner using conditions
    /*
        Determine the winner based on the rules of Rock-Paper-Scissors.
        There are 3 possible outcomes:
        1. Tie → if both the player and the computer choose the same option.
        2. Player wins → if the player's choice beats the computer's choice:
            - Rock beats Scissors
            - Paper beats Rock
            - Scissors beats Paper
        3. Computer wins → if none of the above conditions are true,
           then the computer must have the winning choice.
    */

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    // and then we presented the winner in the console so the user can see who wins
    if (winner == "Tie") {
        println("It's a Tie!!!")
    }  else {
        println("$winner won!!")
    }
}