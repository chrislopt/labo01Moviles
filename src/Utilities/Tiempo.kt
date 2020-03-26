package Utilities

import java.util.*

class Tiempo (
    var hora :Int = 0,
    var minutos : Int = 0,
    var segundos : Int = 0

){
   var Japon : String = "JAP"
    var Rusia : String = "RUS"
    var Alemania : String = "ALE"

    fun Cambio(
        resta:Int
    ): Int {
        var H: Int = hora + resta
        if(H>24) H-=24
        
    }

    fun Hor(TZ:String):String{
        when(TZ){
            "JAP"->return "en Japon son las ${Cambio(6).toString()}:${minutos}:${segundos}"
            "RUS"->return "en Rusia son las ${Cambio(8).toString()}:${minutos}:${segundos}"
            "ALE"->return "en Alemania son las ${Cambio(6).toString()}:${minutos}:${segundos}"
        else-> return "oopps"
        }
    }
}