````
fun main(args: Array<String>) {
var nombre:Int = lireNombre()
}

fun lireNombre() : Int{
var nombre = 0
while(true){
println("Veuillez entrer votre nombre entier : ")
var lecture:String = readln()
nombre = lecture.toInt()
}
return nombre
}
````
la lecture du nombre ne finis jamais, le while lit et verifie si il peut le transformer en int
mais si c'est n'est pas possible, il va y avoir un erreur et, si le nombre est valide la boucle va a re demander
un nouveau nombre