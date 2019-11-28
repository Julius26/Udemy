package functions


/*function overloading*/
fun some(a: String){
    println("Some(a: String) call...")
}
fun some(a : Int){
    println("some(a: Int)")
}

fun some(a: Int, b:String){
    println("some(a: Int, b: String)")
}




fun main(args: Array<String>){

//    val q = some(4,"julius")
//    println(q)

    val a = 3
    when (a){
        1 -> println("One is printed")
        2 -> println("two is printed")
        3 -> println("three is printed")
        else -> {
            println("You got an error")
        }
    }
}

//expressions
//consist of constants, variables, operator /functions which evaluate to a single value
//statements have characters and sysmbols that make up a complete unit of execution