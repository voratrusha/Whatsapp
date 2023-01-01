package ModelClass

class chat_model {
    lateinit var name: String
    lateinit var msg : String
    lateinit var time : String
    var img : Int=0

    constructor(name:String,msg:String,time:String,img:Int){
        this.name = name
        this.msg = msg
        this.time = time
        this.img = img
    }
}