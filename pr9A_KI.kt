fun main() {
    val dog1 = Slug_dog("Агрессивный", "Боб") // Создание объекта
    println("Собака №1:")
    println("Введите срок службы собаки:")
    dog1.sr_slug = readLine()!!.toInt()
    println("Введите характер собаки:")
    dog1.haract = readLine()!!

    val dog2 = Dog("Шарик")
    println("Собака №2:")
    println("Введите рост и вес собаки:")
    dog2.Proverka(readLine()!!.toDouble(), readLine()!!.toDouble())
    dog2.ProverkaVesa() // Проверка соответствия веса и роста

    val dog3 = Poroda("Лаки", "Шпиц")
    println("Собака №3:")
    println("Введите породу собаки:")
    dog3.porod = readLine()!!
    println("Введите окраску собаки:")
    dog3.okras = readLine()!!

    // Информация о собаке
    dog1.Info_dog()
    dog2.Info_dog()
    dog3.Info_dog()
}
