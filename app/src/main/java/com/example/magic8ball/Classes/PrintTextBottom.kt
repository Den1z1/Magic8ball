package com.example.magic8ball.Classes

import android.view.View
import android.widget.Button
import com.example.magic8ball.R
import kotlin.random.Random

class ChangeTextBottom() {
    fun changeText (view: View){
        val buttonAsk: Button = view.findViewById(R.id.buttonAsk)
        val buttonTalk = Random.nextInt(0,3)

        when(buttonTalk){
            0 -> buttonAsk.text = "Ask more!"
            1 -> buttonAsk.text = "Do not be shy!"
            2 -> buttonAsk.text = "Click me!" 
        }
    }
}