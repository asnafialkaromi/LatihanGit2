class Circle{
    val phi : Double = 3.14
    var r : Double = 0.0

    private fun circleArea(): Double {
        return phi* r * r
    }

    private fun circumference(): Double {
        return 2 * phi * r
    }

    private fun inputUser(){
        print("Masukkan Jari-Jari Lingkaran (cm): ")
        r = readln().toDouble()
    }

    fun run(){
        inputUser()
        print("Luas Lingkaran: ")
        println(circleArea())
        print("Keliling Lingkaran: ")
        println(circumference())
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            Circle().run()
        }
    }
}

class Triangle {
    private var alasSegitiga : Double = -1.0
    private var tinggiSegitiga : Double = -1.0
    private var sisiSatu : Double = -1.0
    private var sisiDua : Double = -1.0
    private var sisiTiga : Double = -1.0

    private fun calcWide () {
        print("Masukkan alas segitiga : ")
        alasSegitiga = readln().toDouble()
        print("Masukkan tinggi segitiga : ")
        tinggiSegitiga = readln().toDouble()
        val result = (alasSegitiga * tinggiSegitiga)/2
        println("------------------------------")
        println("Hasil Luas Segitiga = $result \n")
    }

    private fun calcAround () {
        print("Masukkan sisi satu : ")
        sisiSatu = readln().toDouble()
        print("Masukkan sisi dua : ")
        sisiDua = readln().toDouble()
        print("Masukkan sisi tiga : ")
        sisiTiga = readln().toDouble()
        val result = sisiSatu + sisiDua + sisiTiga
        println("---------------------------------")
        println("Hasil Keliling Segitiga = $result \n")
    }

    fun run () {
        calcWide()
        calcAround()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Triangle().run()
        }
    }
}