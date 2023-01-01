package ModelClass

class call_model {
    lateinit var clname: String
    lateinit var clday : String
    lateinit var cltime : String
    var climgs : Int=0

    constructor(clname:String,clday:String,cltime:String,climgs:Int){
        this.cltime = cltime
        this.clname = clname
        this.clday = clday
        this.climgs = climgs
    }
}