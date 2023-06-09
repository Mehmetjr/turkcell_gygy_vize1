package Class6

class Memur(private var _mesai :Int,private var _mesaiUcreti:Double): Calisan() {
    override fun mesai(): Int {
        return this._mesai
    }

    override fun mesaiUcreti(): Double {
        return this._mesaiUcreti
    }

    override fun mesaihesapla() {
        var maas = 1000 + _mesai * mesaiUcreti()
        println(maas)
    }
}