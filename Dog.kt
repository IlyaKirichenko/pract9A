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

    // проверка соответствия веса и роста
    fun ProverkaVesa() {
        when {
            rost < 30 -> {
                if (ves < 5) println("Собака слишком худая для своего роста.")
                else if (ves > 10) println("Собака слишком тяжелая для своего роста.")
                else println("Вес собаки соответствует росту.")
            }
            rost in 30.0..60.0 -> {
                if (ves < 10) println("Собака слишком худая для своего роста.")
                else if (ves > 25) println("Собака слишком тяжелая для своего роста.")
                else println("Вес собаки соответствует росту.")
            }
            rost > 60 -> {
                if (ves < 20) println("Собака слишком худая для своего роста.")
                else if (ves > 50) println("Собака слишком тяжелая для своего роста.")
                else println("Вес собаки соответствует росту.")
            }
        }
    }

    // Вывод информации о собаке
    open fun Info_dog() {
        println("Кличка собаки: $name, рост собаки: $rost, вес собаки: $ves")
    }
}
