fun main(args: Array<String>) {
    var num=10
    while (num>=5){
        println(num)
        num-=2
    }
    val students= arrayOf("Alex","Ethen","Mirie","Quinton","Elizabeth","Maina")
    students.sort()
    for (c in students){
        println(c)
    }

    val nambari= arrayOf(12,15,48,74,95,36,45,126,879,75,94,1,5,6,7,8,0,9,-2,-4,-7)
    nambari.sort()
    for (k in nambari){
        println(k)
    }


}