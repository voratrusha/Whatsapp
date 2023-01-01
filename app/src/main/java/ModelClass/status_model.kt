package ModelClass

class status_model {
    lateinit var stname: String
    lateinit var stday : String
    lateinit var sttime : String
    var stimg : Int=0

    constructor(stname:String,stday:String,sttime:String,stimg:Int){
        this.sttime = sttime
        this.stname = stname
        this.stday = stday
        this.stimg = stimg
    }
}