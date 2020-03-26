package Figures

class Cuadrado (
    override var name: String = "cuadrado",
    private var lad : Double
):Figure{
    override fun perimeter(): Double {
        return lad*4
    }

    override fun surface(): Double {
        return lad*lad

    }
}