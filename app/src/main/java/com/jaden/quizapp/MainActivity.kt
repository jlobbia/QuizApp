package com.jaden.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
//import raw.questions.json

class MainActivity : AppCompatActivity() {

    lateinit var titletext : TextView
    lateinit var questionNumSentence : TextView
    var questionNumber = 1
    var score = 0
    lateinit var leftButton : Button
    lateinit var rightButton: Button
    lateinit var question : TextView
    lateinit var correctNum : TextView
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titletext = findViewById(R.id.titletext)
        titletext.text = "Quiz App"

        questionNumSentence = findViewById(R.id.QuestionNum)
        questionNumSentence.text = "Question: $questionNumber"

        leftButton = findViewById(R.id.leftButton)
        leftButton.text = "TRUE"

        rightButton = findViewById(R.id.rightButton)
        rightButton.text = "FALSE"

        question = findViewById(R.id.question)
        question.text = "QUESTION HERE"

        correctNum = findViewById(R.id.correctNum)
        correctNum.text = "Score: $score"



        val inputStream = resources.openRawResource(R.raw.questions)

        val jsonText = inputStream.bufferedReader().use{
            it.readText()
        }

        Log.d(TAG, "onCreate: $jsonText")

        val list = listOf("Question 1")

        val gson = Gson()
        val jsonString = gson.toJson(list)
    val type = object : TypeToken<List<Question>>() { }.type
        val questions = gson.fromJson<List<Question>>(jsonString, type)
        Log.d(TAG, "onCreate: \n${questions.toString()}")

        //val quiz = Quiz(questions)

        leftButton.setOnClickListener {
            questionNumber++
            questionNumSentence.text = "Question: $questionNumber"

        }
        rightButton.setOnClickListener {
            questionNumber++
            questionNumSentence.text = "Question: $questionNumber"

        }

        fun showScore {
            if(questionNumber >= questions.size)
        }


    }
}