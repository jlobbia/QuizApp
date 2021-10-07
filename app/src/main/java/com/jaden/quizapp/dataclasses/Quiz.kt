package com.jaden.QuizApp

import com.jaden.quizapp.Question

data class Quiz(var questions: List<Question>) {
    var score = 0
    var currIndex = -1

    fun checkAnswer(answer:Boolean) {
        if(answer) {
            score++
        }
        else {
            score--
        }
    }
}