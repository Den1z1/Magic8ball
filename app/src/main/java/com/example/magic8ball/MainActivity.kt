package com.example.magic8ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.coroutines.*
import android.widget.TextView
import android.widget.Toast
import com.example.magic8ball.Classes.BallAnswer
import com.example.magic8ball.Classes.ChangeTextBottom
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    val scope = CoroutineScope(Dispatchers.Main + CoroutineName("MyScope"))

    fun askQuestions(view: View)  {
        scope.launch() {
            val job = launch {
                val textInBall: TextView = findViewById(R.id.textInBall)
                textInBall.text = BallAnswer().listAnswer[Random.nextInt(0, 8)]
            }
            delay(100)
            job.cancelAndJoin()
        }

        ChangeTextBottom().changeText(view)
    }


    fun clickButton(view: View) {
        val toast = Toast.makeText(this, "Click on the button.", Toast.LENGTH_SHORT)
        toast.show()
        println(1)
    }
}



