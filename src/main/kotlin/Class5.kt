class Class5 {

    fun isPrime(sayi:Int):Boolean{

        if(sayi <= 1)
            return false


        if(sayi == 2)
            return true

        if(sayi % 2 == 0)
            return false

        var check = true

        for(item in 3..sayi/2) {
            if((sayi % item) == 0) {
                check = false
                break
            }
        }

        return check

    }
}