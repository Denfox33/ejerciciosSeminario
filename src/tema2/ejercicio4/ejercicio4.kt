package tema2.ejercicio4

fun informacionPersonal(nombre: String, edad: Int, ciudad: String) {
    val informacion = "Mi nombre es $nombre, tengo $edad años y vivo en la ciudad de $ciudad."
    println(informacion)
}

fun main() {
    val Nombre = "Manu"
    val Edad = 28
    val Ciudad = "Granada"

    informacionPersonal(Nombre, Edad, Ciudad)
}