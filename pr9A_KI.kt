fun main () {

    var dog1 = Slug_dog("Агрессивный", "Боб" ) //Создание объекта
    println("собака №1:")
    println("Введите срок службы собаки:")
    dog1.sr_slug = readLine()!!.toInt()
    println("Введите характер собаки:")

    var dog2 = Dog("Шарик")
    println("собака №2:")
    println("Введите рост и вес собаки:")
    dog2.Proverka(readln()!!.toDouble(),readln()!!.toDouble())

    var dog3 = Poroda("Лаки", "Шпиц")
    println("собака №3:")
    dog3.porod = readLine()!!.toString()
    println("Введите окраску собаки:")
    dog3.okras = readLine()!!.toString()
        //Информация о собаке
    dog1.Info_dog()
    dog2.Info_dog()
    dog3.Info_dog()
}