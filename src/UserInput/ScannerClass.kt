package UserInput

import java.util.*

fun main(args: Array<String>){

    val read = Scanner(System.`in`)

//    taking interger input
    println("Enter an interger no")

    val inta = read.nextInt()
    println("The int entered is : $inta")

    println("Enter an double no")
//    reading double
    val intb = read.nextDouble()
    println("The no entered is $intb")

    println("Enter an float no")
//    reading flot
    val floata = read.nextFloat()
    println("The float no is $floata")
}