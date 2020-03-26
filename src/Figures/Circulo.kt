package Figures

class Circulo (
    override var name: String = "circulo",
     private var radio : Double,
    val PI:Double
):Figure{
    override fun perimeter(): Double {
        return radio*2*PI
    }

    override fun surface(): Double {
        return radio*radio*PI

    }
}