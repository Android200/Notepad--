data class Todo(var _id:Int, var _note:String){
    private var id: Int =_id
    private var note: String = _note



    fun getId(): Int {
        return id
    }

    fun getNote():String{
        return note
    }


}