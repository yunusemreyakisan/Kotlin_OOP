package com.yakisan.kotlinoop.sanatci_inheritance

open class Sanatci(isim : String, dal : String, yas : Int?) {

    //Encapsulation
    var isim : String? =isim
        private set
        get

    var dal : String = dal
        private set
        get


    private var yas : Int? = yas
}