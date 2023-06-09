package Class6

class Müdür(private var _mesai :Int,private var _mesaiUcreti:Double):Calisan() {

    override fun mesai(): Int {
        return this._mesai
    }

    override fun mesaiUcreti(): Double {
        return this._mesaiUcreti
    }

    override fun mesaihesapla() {
        var maas = 3000 + _mesai * mesaiUcreti()
        println(maas)
    }
}