open class Dog(var name : String) {
    var rost = 0.0
    var okras : String = ""
    var ves = 0.0
    fun Proverka (rost : Double, ves : Double){
        when {
            (rost < 0) -> println("Не может быть отрицательного роста")
            (ves < 0) ->  println("Не может быть отрицательного веса")
        }
    }

        //вывод информации О СОБАКЕ
   open fun Info_dog() {
        println("кличка собаки: $name, рост собаки: $rost, вес собаки $ves")
    }

}