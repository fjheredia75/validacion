fun main(){
    println ("Prueba de multiplicar ? " + testproduct())
    println ("Prueba de sumarProducts? " + testsumProduct())
    println ("Prueba de dividir? " + testdifferenceOfTen())
    println ("Prueba de validarNumber? " + testIsValidNuiNumber())

//llamado a todas las funciones tests
}

fun product (coefficient: Int, digit: Int): Int{

    val multiplicar = coefficient * digit
    if (multiplicar > 9 ){
        return multiplicar - 9
    }else {
        return multiplicar
    }

// recibe dos parametros y obtiene el resultado.

// esta funcion devuelve el resultado, si este resultado es mayor a 9 se le resta 9

}
val array = arrayListOf<Int>(1,7,5,1,2,5,9,7,7)

fun testproduct():Boolean{
    val res=product (2,3)
    val esp= 6
    return (res == esp)
}



fun sumProducts (array: ArrayList<Int>): Int{

    var resultado = 0
    for ((i,v) in array.withIndex())
    {
        if (i% 2 == 0){
            resultado = resultado + product(v,2)

        }else {
            resultado = resultado + product(v,1)

        }



    }
// recibe un array tipo Int de nueve elementos y recorre cada uno de los elementos

// en cada iteracion llama a la funcion product  y almacena los resultados en una variable

// Considerar que la funcion product requiere un coeficiente que es 2 el indice es par y 1 si es impar.

// Sumar cada resultado que devuelve product y guardarlo en una variable

// al final devuelve la variable que contiene la suma

}
fun testsumProduct():Boolean{
    val res=product(2,1)
    val esp= 9
    return (res == esp)
}



fun differenceOfTen (number: Int): Int {

    val residuo= number / 10
    if(residuo == 0) {
        return 0
    }else {
        return 10 - residuo
    }

// esta funcion recibe un parametro que se divide para 10 y se obtiene el residuo

// Si el residuo es 0 se devuelve 0

// Si el residuo es diferente de 0 se devuelve la diferencia con 10.

}
fun testdifferenceOfTen():Boolean{
    val res=differenceOfTen(10)
    val esp= 0
    return (res == esp)
}

fun IsValidNuiNumber (nui:String): Boolean {
    val nui = "1751259779"
    val array = arrayOf(1,7,5,1,2,5,9,7,7)
    val lastDigit = 9
    val resultado = sumProducts(array)

    val difference = differenceOfTen(resultado)

    if (sumProducts() % 10 == 0 &&sumProducts()  % 10 == resultado) {
       nui = true
    } else if (10 - sumProducts() % 10 == resultado) {
        nui = true
    } else {
        return (difference == lastDigit)
    }

// Esta funcion recibe un String con los 10 digitos de un numero de cedula.

// Separa los 9 primero digitos y los almacena en un array de enteros. El decimo digito lo almacena en una variable

// Llama a la funcion sumProducts y le pasa el array de los 9 primeros digitos

// Llama a la funcion differenceOfTen y le pasa el valor devuelto por la funcion sumProducts

// Compara el valor devuelto de la funcion differenceOfTen con el decimo digito, si son iguales devuelve true, caso contrario devuelve false

}
fun testIsValidNuiNumber():Boolean{
    val res=IsValidNuiNumber ("1751259779")
    val esp= 9
    return (res == esp)
}

