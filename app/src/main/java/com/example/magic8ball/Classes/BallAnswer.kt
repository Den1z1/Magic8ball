package com.example.magic8ball.Classes

class BallAnswer {
    val answer1 = "Maybe!"
    val answer2 = "Exactly \nyes!"
    val answer3 = "Definitely \nnot!"
    val answer4 = "Unanswered \nquestion"
    val answer5 = "Depends \non you"
    val answer6 = "There are \nchances!"
    val answer7 = "Unlikely"
    val answer8 = "Ask one \nmore)"

    val listAnswer = mutableListOf<String>(
        answer1, answer2, answer3, answer4,
        answer5, answer6, answer7, answer8
    )
}