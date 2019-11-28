package Strings

import java.lang.Exception


//return value function
fun returnFunction(): String {

    val a : String = "Daniel"
    println(a)
    return a
}

//function with no return value
fun noReturnValue(){
    val a: String = "NO return value function"
    println(a)
}




//return value of type Unit

fun  john() :Unit{

}

//no return value
fun jooj(){

}


fun myFun(arg: Nothing?) : Nothing{
    throw Exception()
}



fun main(args: Array<String>){
//    returnFunction()
//    println("")
//    noReturnValue()
//    println("")

    val obj = john()
    println(john())

    val obj1 = jooj()
    println(obj1)

}

