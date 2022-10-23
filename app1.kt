/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */

fun main(args: Array<String>) {
    // sambutan
    println("---------------------------------")
    println("SELAMAT DATANG DI BIODATA LUCIANA")
    println("Silahkan input data pribadimu")
    println("---------------------------------")

    // input dan mengisinya ke variabel
    print("Nama Depan: ")
    var namaDepan = readLine()
    print("Nama Belakang: ")
    var namaBelakang = readLine()
    print("Umur: ")
    var umur = readLine()
    print("Status: ")
    var status = readLine()

    // menampilkan output
    var myProfile = """
+------------------------------------------+
|            BIODATA LUCIANA       
+------------------------------------------+
| Nama depan: $namaDepan
| Nama belakang: $namaBelakang
| Umur: $umur
| Status: $status
"""

    println(myProfile)
 
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println("GroupID,groupMember: $groupId, $groupMember")
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun main(args: Array<String>) {
    var daftarAnggota = ""
    print("Projek Manager: ")
    var projekManager = readLine()
    print("Designer 1: ")
    var Designer1 = readLine()
    print("Designer 2: ")
    var designer2 = readLine()
    print("Hustler: ")
    var hustler = readLine()
    print("Coder: ")
    var coder = readLine()
    
    println(daftarAnggota)
    
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return 0

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Mentor + Jumlah anggota group: $totalMember")
/**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
package app

fun main() {
    val detailGroup: List<String> = listOf("Andika", "Luciana", "Sandy", "Thariq", "Yuris")

    println(detailGroup)
    
}

    
