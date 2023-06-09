package Class6

class GenelMüdürconstructor(private var _mesai :Int,private var _mesaiUcreti:Double) : Calisan() {
    override fun mesai(): Int {
        return this._mesai
    }

    override fun mesaiUcreti(): Double {
        return this._mesaiUcreti
    }

    override fun mesaihesapla() {
        var maas = 5000 + _mesai * mesaiUcreti()
        println(maas)
    }
}