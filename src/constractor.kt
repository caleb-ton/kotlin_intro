class Student(val name:String, var age:Int){

}


fun main(args: Array<String>) {
//    object
    val stud1=Student("Caiden",15)
    println("Stud Name: ${stud1.name}")
    println("Stud Age: ${stud1.age}")
}