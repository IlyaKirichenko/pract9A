class DetskiySeans(
    nazvanieFilma: String,
    seans: String,
    stoimostBileta: Double,
    zal: Int,
    kolichestvoZriteley: Int,
    var vozrastnoeOgranichenie: Int // Возрастное ограничение
) : KinoSeans(nazvanieFilma, seans, stoimostBileta, zal, kolichestvoZriteley) {

    // Функция для проверки возрастного ограничения
    fun ProverkaVozrasta() {
        println("Возрастное ограничение для этого сеанса: $vozrastnoeOgranichenie+")
        if (vozrastnoeOgranichenie > 6) {
            println("Этот сеанс не подходит для маленьких детей.")
        } else {
            println("Этот сеанс подходит для детей.")
        }
    }

    // Переопределение функции InfoSeans для добавления информации о возрастном ограничении
    override fun InfoSeans() {
        super.InfoSeans()
        println("Возрастное ограничение: $vozrastnoeOgranichenie+")
    }
}