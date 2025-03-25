import kotlin.math.ln

fun myfunction(){
    println("This is my first function")
}
fun main(args: Array<String>) {
    myfunction()
    addtwonum()
}
fun addtwonum(){
    println("Enter first number : ")
    val number1=Integer.valueOf(readlnOrNull())
    println("Enter second number : ")
    val number2=Integer.valueOf(readlnOrNull())


    print("The sum of $number1 and $number2 is ${number1+number2}")
}


fun studreg(fname:String,lname:String,age:Int){
    println("Student firstname is: $fname , Last name: $lname and age: $age .")
}