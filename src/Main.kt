//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("=============================1============================")

    val array = arrayOf(9, 5, 1, 7, 3, 4, 6, 8, 2)
    var startIndex = array.indexOf(3)
    var endIndex = array.indexOf(9)

    if (startIndex > endIndex) {
        val buf = startIndex
        startIndex = endIndex
        endIndex = buf
    }

    var sum = 0
    while (startIndex <= endIndex) {
        sum += array[startIndex]
        startIndex++
    }
    println("Сумма = $sum")

    println("=============================2============================")

    val numbers = listOf(1, 2, 3, 4)
    val foldValue = numbers.fold(""){a,b -> "$a$b"}
    println(foldValue)

    println("=============================3============================")

    val players = listOf(
        Player("Alex", 15000, 54015),
        Player("Liza", 11000, 42500),
        Player("John", 22015, 80472)
    )
    var allExperience = 0
    var allMoney = 0
    for (i in players){

        allExperience += i.experience
        allMoney += i.money
    }
    println("Общее количество очков = $allExperience, общее количество денег = $allMoney")

    println("=============================4============================")
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    println(groupAndSort(fruits))
}

fun groupAndSort(value: List<String>): MutableMap<Char, List<String>>{
    val newValue: MutableMap<Char, List<String>> = mutableMapOf()
    for (i in value){
        val newList: MutableList<String> = mutableListOf()
        val symbol = i.first()
        for (j in value){
            if (j.first().lowercaseChar() == symbol.lowercaseChar() && j.length % 2 == 0) newList.add(j)
        }
        newValue.put(symbol.lowercaseChar(), newList)
    }
    return newValue
}



