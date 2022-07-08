package com.yakisan.kotlinoop.islemler_polymorphism.hayvanlar_dinamik_poly

class Kopek : Hayvan() {

    fun kopekcik(){
        println("Kopekcik çağrıldı.")
    }

    //Hayvan sınıfından miras aldığımızdan aynı fonksiyonu kullanmak istediğimizde
    //override etmemiz ve  hayvan sınıfındaki sesCikar() fonksiyonunu açık hale getirmemiz gerekiyor.
    override fun sesCikar(){
        println("Hav hav hav")
        //Hayvan() sınıfındaki sesCikar() fonksiyonu üzerine yazıldı.
    }

    //Hayvan sınıfındaki sesCikar() fonksiyonuna referans verir ve yazdırır.
    fun sesCikarRef(){
        super.sesCikar()
    }

}