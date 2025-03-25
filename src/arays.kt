fun main(args: Array<String>) {
    val myArray= arrayOf(4,5,2,8,3,9,75,2,6,63,94)
    val myArray2= arrayOf("Kenya","Uganda","Tanzania","Burundi","Somalia")

    println(myArray[1])
    println("I was born in ${myArray2[4]}")

    for (i in myArray2){
        println(i)
    }
}