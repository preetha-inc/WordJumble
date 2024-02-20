package com.example.wordjumble

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val clueButton=findViewById<Button>(R.id.btnClue)

        clueButton.setOnClickListener{
            val dialogBinding = layoutInflater.inflate(R.layout.clue_pop_up, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            
            val okayButton = dialogBinding.findViewById<Button>(R.id.btnOkay)
            okayButton.setOnClickListener{
                myDialog.dismiss()
            }
        }
    }
}