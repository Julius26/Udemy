package Strings

val doubleQuote: String = "\n 30 of days ruitech " +
        "code"

val trippleQuote: String = """
    hello
    today 
    marks the fourth meeting of ruitech code
    We are hoping to learn so many new things
    
""".trimIndent()

fun main(args: Array<String>){
    println(doubleQuote)
    println("")
    println(trippleQuote)
}



