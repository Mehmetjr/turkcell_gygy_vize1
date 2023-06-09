class Class3 {


    private var res = 0.0
    private var fact= 1.0
    fun sumOfSeries(num:Int){
        for (item in 1..num.toInt()){
        fact *= item
        res += (item/fact)

    }

        println(res)




}
}
