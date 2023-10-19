package ejercicio18
//ejercicio 18 crea una funcion para determinar si un numero es primo
fun primos (numero: Int):Boolean {
    if ( numero <=1){
        return false
    }
    for (i in 2 until numero){
        if(numero% i ==0 ){
            return true
        }
    }
    return true
}
fun main () {

    val  num=18
    val primo = primos(num)
        if(primo){
        println("Es primos")
    } else {
        println("No lo es")
    }
}