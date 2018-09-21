import java.util.*

fun main(args: Array<String>){

    println("NOTEPAD--")
    println("Enter Note ID")
    var enter = Scanner(System.`in`)
    var id:Int? = enter.nextInt()
    id.toString()

    println("Enter Note")
    var see = Scanner(System.`in`)
    var note:String = see.nextLine()

    do{

        println("Choose an Option")
        println("(a)Update \n(b)Read Note")
        val guduma = Scanner(System.`in`)
        var option:String = guduma.nextLine()

        if(option=="a" || option=="A"){

            println("Your New ID")
            enter = Scanner(System.`in`)
            id= enter.nextInt()

            println("Enter Your New Note")
            see = Scanner(System.`in`)
            note= see.nextLine()
            save(id, note)


        }else if (option=="b" || option=="B"){

            val todo = Todo(id!!,note)
            display(todo)

        }else{
            println("Wrong Entry")
        }

        println("Do you want to search again (Y/N)")
        val exit = Scanner(System.`in`)
        var quit:String? = exit.nextLine()
    }while (quit=="y" || quit=="Y")
}

fun save(id:Int,note:String){
    val todo = Todo(id,note)

    println(response(todo))

}

fun display(todo: Todo){
    println("ID: ${todo.getId()}")
    println("NOTE: ${todo.getNote()}")

}

fun response(todo: Todo){
    println("Saved Successfully")
    println("${todo.getId()} ${todo.getNote()}")
}
