package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
fun main(args: Array<String>) {
   try {
      val nilai:Int = 5;
      val pesan:String = "Contoh";
      pesan.toInt();
   } catch(e:Exception) {
      e.printStackTrace();
   } finally {
      println("Contoh penanganan pengecualian di kotlin");
   }
}
}
