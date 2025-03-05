fun main() {
    // Создание объектов
    val seans1 = Premiera("Интерстеллар", "18:00", 500.0, 5, 120, true)
    println("Сеанс №1:")
    seans1.InfoSeans()
    seans1.ProverkaZapolnenostiZala()
    seans1.ProverkaPremiery()

    val seans2 = DetskiySeans("История Игрушек", "12:00", 300.0, 2, 50, 5)
    println("Сеанс №2:")
    seans2.InfoSeans()
    seans2.ProverkaZapolnenostiZala()
    seans2.ProverkaVozrasta()
}