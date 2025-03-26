open class Myparentclass{
    val father="He likes watching football"
    val mother="She likes shopping"

}
class MyBoychildclass:Myparentclass(){
    fun boy(){
        println(father)
    }
}
class MyGirlchildclass:Myparentclass(){
    fun girl(){
        println(mother)
    }

}

fun main(args: Array<String>) {
    val obj=MyBoychildclass()
    obj.boy()
    val obj2=MyGirlchildclass()
    obj2.girl()
}