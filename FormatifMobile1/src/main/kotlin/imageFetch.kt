import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


fun main(){
    val url = "https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/lotr.html"

    val doc : Document = Jsoup.connect(url).get()

    val images : Elements = doc.select("img")

    for(element in images){
        println("${element.attr("src") }  ${element.attr("alt")}")
    }


}