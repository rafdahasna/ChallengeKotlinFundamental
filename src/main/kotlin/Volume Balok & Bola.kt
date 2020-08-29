import java.awt.SystemColor.menu
import java.util.Scanner;
public var input = Scanner(System.`in`)

fun main() {
    val input = Scanner(System.`in`)
    println("Masukkan Identitas Anda")
    print("Nama : ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap diisi")
        main()
    }
    print("Kelas : ")
    val kelas: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Jangan lupa diisi")
        main()
    }
    print("Absen : ")
    val absen:String? = input.nextLine()
    println(" ")

    println("Kamu ingin menghitung apa?")
    println("1. Volume Balok\t\t\t")
    println("2. Volume Bola \t\t\t")
    print("Masukkan Menu Bangun Ruang : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println(" ")
            println("=======================")
            print("Masukkan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukkan Lebar Balok : ")
            val l: Double = input.nextDouble()
            print("Masukkan Tinggi Balok : ")
            val t: Double = input.nextDouble()

            val vt: Double = p * l * t;

            println(" ")
            println("Volume Balok adalah = $vt ")

            print("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }
        }
        "2" -> {
            println(" ")
            println("=======================")
            print("Masukkan Jari Jari Bola : ")
            val r: Double = input.nextDouble()

            val vb: Double = 4/3 * 22/7 * r * r * r;

            println(" ")
            println("Volume Bola adalah = $vb ")

            print("kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }
        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}