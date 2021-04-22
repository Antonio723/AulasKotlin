package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {
            if(verificarCamposDigitados()==true) {
                calcularImc()
            }
        }
        button_limpar.setOnClickListener {
            limparCampos()
        }
    }
    fun calcularImc() {
        var imc = Imc()
        imc.peso = edit_peso.text.toString().toInt()
        imc.altura = edit_altura.text.toString().toDouble()

        text_resultado.text = imc.calcularIMC().toString()
    }
    fun limparCampos() {
       edit_peso.text.clear()
        edit_altura.text.clear()
        edit_peso.requestFocus()
    }
    fun verificarCamposDigitados():Boolean {
        if (edit_peso.text.isEmpty()) {
            edit_peso.error = "Você deve preencher este campo"
            return false
        } else if (edit_altura.text.isEmpty()) {
            edit_altura.error = "Você deve preencher este campo"
            return false
        }
        return true
    }
}