package Figures

class Rectangulo (
    override var name: String = "rectangulo",
    private var ancho : Double,
    private var largo:Double
):Figure{
    override fun perimeter(): Double {
        return 2*ancho+2*largo
    }

    override fun surface(): Double {
        return ancho*largo

    }
}