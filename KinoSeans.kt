open class KinoSeans(
    var nazvanieFilma: String, // Название фильма
    var seans: String, // Время сеанса
    var stoimostBileta: Double, // Стоимость билета
    var zal: Int, // Номер зала
    var kolichestvoZriteley: Int // Количество зрителей
) {
    // Вместимость зала 
    val vmeshaemostZala: Int = 100

    // Функция для вывода информации о сеансе
    open fun InfoSeans() {
        println("""
            Информация о киносеансе:
            Название фильма: $nazvanieFilma
            Время сеанса: $seans
            Стоимость билета: $stoimostBileta руб.
            Зал: $zal
            Количество зрителей: $kolichestvoZriteley
        """.trimIndent())
    }

    // Функция для проверки заполненности зала
    fun ProverkaZapolnenostiZala() {
        when {
            kolichestvoZriteley > vmeshaemostZala -> println("Зал переполнен! Количество зрителей превышает вместимость.")
            kolichestvoZriteley == vmeshaemostZala -> println("Зал заполнен полностью.")
            else -> println("В зале ещё есть свободные места.")
        }
    }
}