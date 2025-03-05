class Poroda(_name: String, var porod: String) : Dog(_name) {
    var okras: String = ""

    override fun Info_dog() {
        println("Кличка собаки: $name, порода собаки: $porod, окрас шерсти: $okras")
    }
}
