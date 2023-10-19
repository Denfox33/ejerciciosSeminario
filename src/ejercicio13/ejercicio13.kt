package ejercicio13


    //Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet devuelva su correspondiente
// etiqueta HTML, teniendo en cuenta sólo los atributos de clase e id.

fun emmetToHTML(cadena: String): String {
    val parts = cadena.split(".", "#")
    val tagName = parts[0]

    val attributes = mutableListOf<String>()

    for (part in parts) {
        if (part.isNotEmpty()) {
            if (part[0] == '.') {
                attributes.add("class=\"${part.substring(1)}\"")
            } else if (part[0] == '#') {
                attributes.add("id=\"${part.substring(1)}\"")
            }
        }
    }

    val attributesStr = attributes.joinToString(" ")

    return "<$tagName $attributesStr></$tagName>"
}

fun main() {
    val emmet1 = "a"
    val emmet2 = "div.oferta"
    val emmet3 = "div.coche#VWPolo"

    println(emmetToHTML(emmet1))
    println(emmetToHTML(emmet2))
    println(emmetToHTML(emmet3))
}