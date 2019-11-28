package Loops


fun main(args: Array<String>){

//    for (i in 10 downTo 1 step 2){
//        println(i)
//    }
//
//    val list = listOf<String>("Hellow","World","!!")
//    for ((index,value) in list.withIndex()){
//        println("index: $index, value: $value")
//    }

    var x = 0
    var sum1 = 0

    while (x<10){
//        x=0, sum1= 0 , x,1 sum,1,
        sum1 += ++x


    }

//    println(sum1)

    var x1 =0
    var sum2 = 0
    while (true){
        sum2 += ++x1
        if (x1 == 10)break
    }
    println(sum2)

}