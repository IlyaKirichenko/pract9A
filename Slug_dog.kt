class Slug_dog(var haract: String, _name: String) : Dog(_name) {
    var sr_slug = 0

    fun Es() {
        when (sr_slug) {
            in 1..8 -> println("Срок службы в пределах нормы")
            in 9..13 -> println("Срок службы выше нормы")
            else -> println("Некорректный срок службы")
        }
    }
