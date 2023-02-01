package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recuper botao do XML
        //id do botao
        val btncalcular: Button = findViewById(R.id.btncalcular)
        val edWeight: EditText = findViewById(R.id.edWeight)
        val edHeigth: EditText = findViewById(R.id.edHeight)


        // colocando ação no Button
        btncalcular.setOnClickListener {


            val HeigthStr = edHeigth.text.toString()
            val weightStr = edWeight.text.toString()

            if (HeigthStr.isNotEmpty() && weightStr.isNotEmpty()) {

                val Height: Float = HeigthStr.toFloat()
                val weight: Float = weightStr.toFloat()

                val Heightfinal: Float = Height * Height

                val result: Float = weight / Heightfinal

                //cod para chamar a segunda activity ao clicar no botao

                val intent = Intent(this, ResultActivity::class.java)
                    .apply {

                        putExtra("EXTRA_RESULT", result)
                    }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }
            }
        }
    }