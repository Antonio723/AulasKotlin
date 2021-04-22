package com.example.primeiroapp

import java.text.DecimalFormat

class Imc {
    var peso = 0
    var altura = 0.0

    fun calcularIMC():Double{
        return DecimalFormat(peso/Math.pow(altura , 2.0))
    }

}