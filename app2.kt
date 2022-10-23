package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
fun main (){
    println("Hasil Bilangan Genap")
    for (i:Int in 1..100)
        if (i % 2 == 0){ //menampilkan bilangan genap i % 2 != 0
            println("- $i")
        }
}

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    */
    // Buat di bawah sini
package app    
  
fun main() {
    val map: Map<String, String> = mapOf(
            Pair("Jan", "January"),
            "Feb" to "Februari",
            "Mar" to "Maret",
            "Ap" to "April",
            "Mi" to "Mei",
            "Jun" to "Juni",
            "Jul" to "Juli",
            "Ags" to "Agustus",
            "Sep" to "September",
            "Okt" to "Oktober",
            "Nov" to "November",
            "Des" to "Desember"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}
