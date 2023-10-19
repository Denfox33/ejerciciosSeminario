package tema2.ejercicio5


// Fahrenheit a Celsius
fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

// Fahrenheit a Celsius
fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}
fun main() {
    val temperaturaCelsius = 31.0
    val temperaturaFahrenheit = 128.0

    val resultadoFahrenheit = celsiusToFahrenheit(temperaturaCelsius)
    val resultadoCelsius = fahrenheitToCelsius(temperaturaFahrenheit)

    println("$temperaturaCelsius grados Celsius son equivalentes a $resultadoFahrenheit grados Fahrenheit.")
    println("$temperaturaFahrenheit grados Fahrenheit son equivalentes a $resultadoCelsius grados Celsius.")
}