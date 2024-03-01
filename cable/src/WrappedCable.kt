class WrappedCable(type: String, numberOfWires: Int, diameter: Double, private var isWrapped: Boolean) :
    Cable(type, numberOfWires, diameter), QualityCalculator {
    override fun calculateQuality(): Double {
        val baseQuality = super.calculateQuality()
        return if (isWrapped) {
            2.0 * baseQuality
        } else {
            0.7 * baseQuality
        }
    }
    override fun displayInfo() {
        println("WrappedCable - Type: $type, Wires: $numberOfWires, Diameter: $diameter, Wrapped: $isWrapped, Quality: ${calculateQuality()}")
    }
}