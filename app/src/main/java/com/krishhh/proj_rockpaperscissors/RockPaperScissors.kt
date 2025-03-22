package com.krishhh.proj_rockpaperscissors

fun main(){
    println("Rock, Paper or Scissors? Enter your choice!: ")
    var computerChoice = ""
    val randomNumber = (1..3).random()
    var playerChoice = ""


    while (true) {
        playerChoice = readln().lowercase()
        if (playerChoice == "rock" || playerChoice == "paper" || playerChoice == "scissors") {
            break
        } else {
            println("Invalid input. Please enter 'Rock', 'Paper', or 'Scissors':")
        }
    }

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice.lowercase() -> "Tie"
        playerChoice == "rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie")
    }else{
        println("$winner won!")
    }

}