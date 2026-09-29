import java.io.File

fun main(){
    println("Entrez le chemin de votre fichier")
    val numberFilePath = File(readln())
    var counter = 0
    if(numberFilePath.exists()){
        val fileContent = numberFilePath.readText()
        val lines = fileContent.split("\n")

        for (line in lines){
            try {
                counter += line.trim().toInt()
                println(line)
            }
            catch (e : NumberFormatException){
                println(line)
            }
        }
        println("somme des nombres: $counter")
    }

}