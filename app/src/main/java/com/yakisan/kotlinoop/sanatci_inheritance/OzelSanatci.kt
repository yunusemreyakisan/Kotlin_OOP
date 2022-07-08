package com.yakisan.kotlinoop.sanatci_inheritance


class OzelSanatci(isim: String, dal: String, yas: Int?) : Sanatci(isim, dal, yas) {

    fun sarkiSoyle() {
        println("${isim} şarkı söylüyor...")
    }

    fun oyunOyna() {
        println("${isim} oyun oynuyor... ")
    }


}