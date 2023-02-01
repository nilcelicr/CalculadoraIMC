package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_result)

            supportActionBar?.setHomeButtonEnabled(true)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            val tvResult = findViewById<TextView>(R.id.textView_Result)
            val tvClassificacao = findViewById<TextView>(R.id.textView_classificacao)


            val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

            tvResult.text = result.toString()

            var classificacao = " "
            classificacao = if (result < 18.5f){
                "ABAIXO DO PESO"
            } else if (result in 18.5f..24.9f){
                "PESO NORMAL"
            } else if (result in 25f..29.9f){
                "SOBREPESO"
            }else if (result in 30f..34.9f){
                "OBESIDADE GRAU I"
            } else if (result in 35f..40f){
                "OBESIDADE GRAU II"
            }else {
                "OBESIDADE GRAU III"
            }
            tvClassificacao.text = getString(R.string.message_classificacao, classificacao)

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       finish()
        return super.onOptionsItemSelected(item)

    }
}