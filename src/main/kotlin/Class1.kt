class Class1 {


    fun sayiBul() {
        println("Sayı giriniz ")
        var sayi = readlnOrNull()
        var toplam = 0
        if (sayi != null) {
            if (sayi.toInt() <= 999 || sayi.toInt() > 99) {
                var sayiInt = sayi.toInt()
                while (sayiInt > 0) {
                    var rakam = sayiInt % 10
                    toplam += rakam
                    sayiInt /= 10


                }





                println("Toplam = $toplam")

            }


        }
    }
}