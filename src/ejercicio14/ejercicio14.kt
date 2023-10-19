package ejercicio14

//Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’
//(para n = 6):
//1
//22
//333
//4444
//55555
//666666

fun arbol (numero :Int) :String {
    var mensaje=""
    for(i in 1..numero){
        for (j in 1 ..i){
            mensaje+=numero.toString();
            print(i)
        }
        println()
    }
    return   mensaje
}

fun main () {

    val repeticiones=6
    arbol((repeticiones))
}
