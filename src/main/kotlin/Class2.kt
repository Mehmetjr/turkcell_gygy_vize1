class Class2 {

    fun sayiTers() {
        println("Sayı giriniz ")
        var sayi = readLine()

        if (sayi != null) {
            if (sayi.toInt() <= 999 || sayi.toInt() > 99) {


                println(sayi.reversed())
            }
        }

    }

}