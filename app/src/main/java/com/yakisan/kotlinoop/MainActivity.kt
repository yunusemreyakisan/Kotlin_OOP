package com.yakisan.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yakisan.kotlinoop.islemler_polymorphism.hayvanlar_dinamik_poly.Hayvan
import com.yakisan.kotlinoop.islemler_polymorphism.hayvanlar_dinamik_poly.Kopek
import com.yakisan.kotlinoop.islemler_polymorphism.Islemler
import com.yakisan.kotlinoop.kullanici_siniflar.Kullanici
import com.yakisan.kotlinoop.muzik_aletleri_abstraction_interfaces.Gitar
import com.yakisan.kotlinoop.sanatci_inheritance.OzelSanatci

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sınıflar
        println("-------Sınıflar-------")
        val kullanici  = Kullanici("Yunus Emre", 22, 82.0)
        println("Kullanıcı Bilgileri : ${kullanici.isim}")

        //Encapsulation
        println("-------Encapsulation-------")
        //kullanici.kilo = "" (Assignment Error) private set işlemi
        println("Kullanıcı kilosu : ${kullanici.kilo}")

        //Inheritance (Miras)
        println("-------Inheritance-------")
        //Sanatçı sınıfından miras alarak OzelSanatci sınıfı oluşturduk.
        val ozel = OzelSanatci("Yağız" ,"Şarkıcı", null)
        ozel.sarkiSoyle()
        ozel.oyunOyna()

        //Polymorphism
        println("-------Polymorphism-------")
        //Statik
        println("-Statik-")
        val statik = Islemler()
        println(statik.carpma()) //0
        println(statik.carpma(8,3)) //24

        //Dinamik
        println("-Dinamik-")
        val ozelhayvan = Kopek()
        ozelhayvan.kopekcik() //Kopekcik cagrildi.
        ozelhayvan.sesCikar() //Hav hav hav

        val genelhayvan = Hayvan()
        genelhayvan.sesCikar() //Ses çıkarılıyor...

        //Super Referans verme
        ozelhayvan.sesCikarRef() //Ses çıkarılıyor...


        //Abstraction (Soyutlama) & Arayüzler (Interface)
        println("-------Abstraction & Interface -------")
        //Gitar sınıfının miras aldığı interface sınıflardan alınan bilgi() fonksiyonu.
        val gitar = Gitar()
        gitar.bilgi() //Bilgi veriliyor..

        //Lamba Expressions (Lambda Gösterimi)
        println("-------Lambda (->) -------")
        //Geriye değer döndürmeyen lambda
        val yazdigimiGoster = {yazi : String -> println(yazi)}
        yazdigimiGoster("Yazı gösteriliyor..")
        //Geriye değer döndüren lambda
        val sayilariCarp = {a : Int, b : Int -> println(a * b)} //Int değer döndürür.
        sayilariCarp(6,5)






    }
}