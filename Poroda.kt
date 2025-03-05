class Poroda(_name : String, var porod : String):Dog(_name){
    override fun Info_dog() {
        println ("кличка собаки: $name, порода собаки: $porod, окрас шерсти $okras")
    }
}