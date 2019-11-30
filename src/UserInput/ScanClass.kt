package UserInput

fun main (args: Array<String>){
    println("Write anything here")

    val enteredString = readLine()
    println("You have entered this : $enteredString")


//    taking the input as String and converting it to a no


    println("Enter a value of your choice")


    val input = Integer.valueOf(readLine())

    if (input is Int){
        println("You have enterd an int")
    }else {
        println("Error, please check the value you have entered")

    }


//    println(input)

}