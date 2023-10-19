package tema2.ejercicio3

fun saludar(nombre: String, edad: Int) {
    println("¡Hola, $nombre! Tienes $edad años.")
}

fun main() {
    val Nombre = "Manuel"
    val Edad = 31

    saludar(Nombre, Edad)
}