package com.yakisan.kotlinoop.islemler_polymorphism

class Islemler {

    //Dinamik

    //Çarpma
    fun carp(a :Int , b:Int) : Int{
        return a*b
    }

    //Bolme
    fun bol(a : Int, b: Int) : Int {
        return a / b
    }

    //Çıkarma
    fun cikar(a : Int, b : Int) :  Int {
        return  a - b
    }

    fun toplama(a : Int , b : Int ) : Int {
        return a + b
    }


    //Statik
    fun carpma(a : Int, b: Int) : Int {
        return a * b
    }

    fun carpma() : Int {
        return 0
    }

}