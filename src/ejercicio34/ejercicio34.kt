package ejercicio34

//Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
//utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre
//él).

fun encriptar(texto: String): String {
    val textoEncriptado = StringBuilder()
    for (i in texto.indices) {
        val char = texto[i]
        when (char) {
            'a' -> textoEncriptado.append("0")
            'e' -> textoEncriptado.append("1")
            'i' -> textoEncriptado.append("2")
            'o' -> textoEncriptado.append("3")
            'u' -> textoEncriptado.append("4")
            else -> textoEncriptado.append(char)
        }
    }
    return textoEncriptado.reverse().toString()
}

fun desencriptar(textoEncriptado: String): String {
    val textoOriginal = StringBuilder(textoEncriptado.reversed())
    for (i in textoOriginal.indices) {
        val char = textoOriginal[i]
        when (char) {
            '0' -> textoOriginal.setCharAt(i, 'a')
            '1' -> textoOriginal.setCharAt(i, 'e')
            '2' -> textoOriginal.setCharAt(i, 'i')
            '3' -> textoOriginal.setCharAt(i, 'o')
            '4' -> textoOriginal.setCharAt(i, 'u')
        }
    }
    return textoOriginal.toString()
}

fun main() {
    val texto = "Hello, World!"
    val textoEncriptado = encriptar(texto)
    println("Texto encriptado: $textoEncriptado")

    val textoDesencriptado = desencriptar(textoEncriptado)
    println("Texto desencriptado: $textoDesencriptado")
}
