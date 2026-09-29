
fun main(args: Array<String>) {
    var nombre:Int = lireNombre()
}

fun lireNombre() : Int{
    while(true){
        println("Veuillez entrer votre nombre entier : ")
        try {
            val nombre = readln().toInt()
            return nombre
        }
        catch (e : NumberFormatException){
            println("ce nombre n'est pas valide")
        }
    }
}