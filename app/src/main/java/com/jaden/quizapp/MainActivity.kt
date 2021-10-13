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
        titletext.text = resources.getString(R.string.app_name)

        questionNumSentence = findViewById(R.id.QuestionNum)
        questionNumSentence.text = resources.getString(R.string.question_num)+" "+questionNumber

        leftButton = findViewById(R.id.leftButton)
        leftButton.text = resources.getString(R.string.button_true)

        rightButton = findViewById(R.id.rightButton)
        rightButton.text = resources.getString(R.string.button_false)

        question = findViewById(R.id.question)
        question.text = resources.getString(R.string.question_here)

        correctNum = findViewById(R.id.correctNum)
        correctNum.text = resources.getString(R.string.score) + " " +score



        val inputStream = resources.openRawResource(R.raw.questions)

        val jsonText = inputStream.bufferedReader().use{
            it.readText()
        }

        Log.d(TAG, "onCreate: $jsonText")

        val list = listOf("Question 1")
/*
        val gson = Gson()
        val jsonString = gson.toJson(list)
        val type = object : TypeToken<List<Question>>() { }.type
        val questions = gson.fromJson<List<Question>>(jsonString, type)
        Log.d(TAG, "onCreate: \n${questions.toString()}") */

        //val quiz = Quiz(questions)

        leftButton.setOnClickListener {
            questionNumber++
            questionNumSentence.text = resources.getString(R.string.question_num)+" "+questionNumber

        }
        rightButton.setOnClickListener {
            questionNumber++
            questionNumSentence.text = resources.getString(R.string.question_num)+" "+questionNumber

        }




    }
}