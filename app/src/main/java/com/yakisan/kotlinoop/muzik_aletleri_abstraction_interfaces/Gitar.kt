package com.yakisan.kotlinoop.muzik_aletleri_abstraction_interfaces

//Birden fazla sınıftan miras alma
class Gitar() : IEnstruman, IDekorasyon {

    var marka : String? = null
    var elektroMu : Boolean? = null

    override var oda: String = "Mutfak"

    //Interface sınıfındaki fonksiyona referans verdik ve çalışmasını sağladık.
    override fun bilgi() {
        super.bilgi()
    }

}