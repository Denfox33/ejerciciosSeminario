package ejercicio22
//Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto
// (la suma de sus divisores propios positivos es igual al número), o False en caso contrario.
fun Perfecto (numero: Int):Boolean{

    if(numero <=1){
        return false
    }
    var sumD=1
    for (i in 2..(numero/2)){
        if(numero%i==0){
            sumD+=i;
        }
    }
    return sumD==numero
}


fun main () {
    val num=28
    val esPerfecto= Perfecto(num)
   if( esPerfecto  ) {
        println("$num es un numero perfecto")
    } else {
        println("$num no es un numero perfecto")
    }
}