
# 🚀Kotlin ile OOP Prensipleri

Nesne tabanlı/yönelimli programlama (OOP); yazılım tasarımını nesneler ve nesneler üzerinde düzenleyen bir programlama dili modelidir.

### ➕ Nesne Yönelimli Programlamanın Avantajları
**Doğal:** Doğal olması sayesinde daha anlaşılır program yazma ve geliştirme imkanı sağlanır. \
**Güvenilirlik :** İyi tasarlanmış, özenle yazılmış nesne yönelimli programlar güvenilirdir.\
**Yeniden kullanılabilirlik:** İyi hazırlanmış sınıflar oluşturmak zor bir yetenektir, bu noktada soyutlamaya odaklanmayı ve dikkat etmeyi gerektirir.\
**Sürdürülebilirlik:** Uygulamada bir değişiklik şeffaf olduğu için diğer nesneler otomatik olarak donanımdan fayda sağlayacaktır.\
**Genişletilebirlik:** Yazılım statik değildir bu nedenle yazılımın büyümesini ve değişmesini de göz önünde bulundurmak gerekmektedir.\
**Zaman Tasarrufu :** Programınızı nesneler halinde oluşturmuşsanız bir problem olduğunda birden fazla kod parçası üzerinde ayrı ayrı çalışabilir hatta birden fazla geliştirici tarafından bağımsız olarak aynı anda problemi çözebilirsiniz. 

### 🔥4 Temel Prensip 

**1- Soyutlama** (Abstraction)\
**2- Kapsülleme** (Encapsulation)\
**3- Miras Alma** (Inheritance)\
**4- Çok Biçimlilik** (Polymorphism)

- **Soyutlama**, bir sınıfın özelliklerinin ve davranışlarının tanımlanmasıdır. 
- **Kapsülleme** (Encapsulation) bir sınıfın içerisinde bulunan metodların ve değişkenlerin korumasıdır. 
- **Inheritance** (miras alma/kalıtım), bir nesnenin özelliklerinin farklı nesneler tarafından da kullanılabilmesine olanak sağlayan OOP prensibidir.
- **Polimorfizm**, türetilmiş sınıflar için yöntemleri yeniden tanımlama yeteneğidir.


### ✨Örnek Sınıf Yapısı
```
class Kullanici {

    var isim: String? = null
    var yas: Int? = null

    //İnit önce çağrılır.
    init {
        println("init çağrıldı.")
    }
}
```
