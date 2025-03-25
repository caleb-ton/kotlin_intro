fun main(args: Array<String>) {
    print("Enter your grades:")
    val grade = Integer.valueOf(readlnOrNull())
    if (grade in 80..100){
        println("Distinction")
    }
    else if (grade in 60..79){
        println("Credit")
    }
    else if (grade in 50..59){
        println("Pass")
    }
    else{
        println("Fail")
    }
}