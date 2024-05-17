package com.github.rockpaperscissorsicetask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

private fun ImageView.setImageResource(computerChoice: String) {

}

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var rockButton: Button
    private lateinit var paperButton: Button
    private lateinit var scissorsButton: Button
     lateinit var resultImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockButton = findViewById(R.id.rockButton)
        paperButton = findViewById(R.id.PaperButton)
        scissorsButton= findViewById(R.id.ScissorsButton)
        resultImageView = findViewById(R.id.resultImageView)
        resultTextView = findViewById(R.id.resultTextView)

        

      rockButton.setOnClickListener{
            resultTextView.text = "You chose Rock"
        }

        paperButton.setOnClickListener{
            resultTextView.text = "You chose Paper"
        }

        scissorsButton.setOnClickListener{
            resultTextView.text= "You chose Scissors"
        }

        //method playGame(user choice vs computer choice)

            }


            private fun attachClickListener(imageView: ImageView, choice: String) {
                imageView.setOnClickListener {
                    playGame(choice)
                }
            }

            private fun playGame(Choice: String) {
                val choices = listOf("Rock", "Paper", "Scissors")
                val computerChoice = choices[ Random.nextInt(3)]



                //set computer Choice image
                when(computerChoice){
                    "rock"->resultImageView.setImageResource(R.drawable.pierre)
                }
                when(computerChoice){
                    "paper"->resultImageView.setImageResource(R.drawable.x10_wedding_program_cards_peacock_garden)
                }
                when(computerChoice){
                    "scissors"->resultImageView.setImageResource(R.drawable.gold_scissors___gold)
                }
                resultImageView.setImageResource(computerChoice)


                val result = when {
                    Choice == computerChoice -> resultTextView.text = "It's a tie!"
                    Choice == "Rock" && computerChoice == "Scissors" ||
                            Choice == "Paper" && computerChoice == "Rock" ||
                            Choice == "Scissors" && computerChoice == "Paper" -> resultTextView.text= "You win!"

                    else ->  resultTextView.text ="You lose!"
                }



            }


        }



