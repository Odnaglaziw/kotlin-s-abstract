abstract class Cable(var type: String, var numberOfWires: Int, var diameter: Double) : QualityCalculator {
    constructor() : this("", 0, 0.0)
    constructor(type: String, numberOfWires: Int) : this(type, numberOfWires, 0.0)
    override fun calculateQuality(): Double {
        return diameter / numberOfWires
    }
    open fun displayInfo() {
        println("Cable - Type: $type, Wires: $numberOfWires, Diameter: $diameter, Quality: ${calculateQuality()}")
    }
}

