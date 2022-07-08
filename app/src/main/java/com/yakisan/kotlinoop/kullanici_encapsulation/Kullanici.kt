package com.yakisan.kotlinoop.kullanici_encapsulation

class Kullanici {

    var isim: String? = null
    var yas: Int? = null

    //İnit önce çağrılır.
    init {
        println("init çağrıldı.")
    }

    //Secondary Cons.
    constructor(isim: String, yas: Int, kilo: Double?) {
        this.isim = isim
        this.yas = yas
        this.kilo = kilo
        println("Constructor çağrıldı.")
    }

    //Encapsulation (Kapsülleme)
    var kilo: Double? = null
        private set
        get


}