open class Dog(var name: String) {
    var rost: Double = 0.0
    var okras: String = ""
    var ves: Double = 0.0

    fun Proverka(rost: Double, ves: Double) {
        when {
            (rost < 0) -> println("Не может быть отрицательного роста")
            (ves < 0) -> println("Не может быть отрицательного веса")
            else -> {
                this.rost = rost
                this.ves = ves
            }
        }
    }
