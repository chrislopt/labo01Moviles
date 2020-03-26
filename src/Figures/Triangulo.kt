package Figures

class Triangulo (
    override var name: String = "triangulo",
    var ladoUno: Double = 0.0,
    var ladoDos: Double =0.0,
    val altura : Double = 0.0,
    var base: Double =0.0
):Figure{
    override fun perimeter(): Double {
        return base + ladoUno + ladoDos
    }

    override fun surface(): Double {
        return (base*altura)/2

    }
}