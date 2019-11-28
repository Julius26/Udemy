/*arrays*/
var array1 = arrayOf("julius",4,5)
var array2 = intArrayOf(4,4)

var array3 = doubleArrayOf(4.9)

var list1 = listOf<Int>(19 ,33 ,44 ,44)

var list2 = mutableListOf<Int>(55,33,22,44)
fun main(args: Array<String>){
//    mutable and immutable lissts

    list1.forEach{ print(it)}
    list2.forEach{ println( it) }
    list2.add(56)
    list2.forEach{ println( it) }


}