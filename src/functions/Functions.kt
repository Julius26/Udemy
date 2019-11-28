package functions

//if no return value unit type is the return type

fun  sum (a: Int, b: Int): Int{
    return a+b
}


//single expression functions
/*
* you can omit the curly braces
* in single expression functions
* you can also omit return types*/


fun singleExpressionFunction(a: Int,b: Int): Int = a+b

fun main(args: Array<String>){
    val sum = sum(54, 56)
    println(sum)

    val a = singleExpressionFunction(4,5)
    println(a)

}