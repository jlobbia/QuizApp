package com.jaden.quizapp

import com.jaden.quizapp.dataclasses.Question

data class Quiz(var questions: List<Question>) {
    var score = 0
    var currIndex = -1

    /*fun checkAnswer(true) {
        if(true) {
            score++
        }
        else {
            score--
        }
    }*/
}