class Premiera(
    nazvanieFilma: String,
    seans: String,
    stoimostBileta: Double,
    zal: Int,
    kolichestvoZriteley: Int,
    var isPremiera: Boolean // Премьерный ли показ
) : KinoSeans(nazvanieFilma, seans, stoimostBileta, zal, kolichestvoZriteley) {

    // Функция для проверки, является ли показ премьерным
    fun ProverkaPremiery() {
        if (isPremiera) {
            println("Это премьерный показ! Стоимость билета повышена на 20%.")
            stoimostBileta *= 1.2
            println("Новая стоимость билета: $stoimostBileta руб.")
        } else {
            println("Это обычный показ.")
        }
    }

    // Переопределение функции InfoSeans для добавления информации о премьере
    override fun InfoSeans() {
        super.InfoSeans()
        println("Премьерный показ: ${if (isPremiera) "Да" else "Нет"}")
    }
}