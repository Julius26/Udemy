//strings non nullable and nullable
//no nullable are strings which can't be null

val data1: String  = "Julius" +
        "Mutunga"
val data2: String? = null

//triple quotes

val data3: String = """
        julius
        mutunga 
        has $data1
        thanks kotlin for coming through
        
        """

fun test() :Unit{

}

//nothing no return value
/*
* shows explicitly there is no value*/

/*
* type checking
* the operator is checks the type and casts it automatically*/

fun getStringLength(obj: Any): Int?{


    if (obj is String){
        return obj.length
    }

    return null
}

//type casting
/*kotlin doesn't support explicit type casting*/

val a1: Int = 10
val a2: Double = a1.toDouble()



fun main(args: Array<String>){
//    println(data3)

//    val result = test()
//    println(result)


    val result = getStringLength("String")
    println(result)

    println(a2)
}
