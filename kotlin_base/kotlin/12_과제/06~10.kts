// 문제6
fun dice():List<List<Int>>{
    val resultList = mutableListOf<List<Int>>()
    val dicePair = mutableListOf<Int>()
    val diceResult = mutableListOf<Int>()
    for (i in 1..6){
        for (j in 1..6){
            if(i+j == 6){
                // var temp = listOf<Int>(i,j)
                resultList.add(listOf<Int>(i,j))
                dicePair.add(i)
                dicePair.add(j)
                diceResult.addAll(dicePair)
                dicePair.removeAt(0)
                dicePair.removeAt(1)
            }
        }
    }
    return resultList
}
// println(dice())
/*val diceResult = listOf<listOf>()
diceResult = dice()*/
// 반환형 List<List<Int>>

// 문제7
fun eatUntilNotHungry(totalCount: Int, currentCount: Int){
    var currentCountCopy : Int = currentCount
    do {
        println("밥을 먹었다")
        currentCountCopy++
    }while (currentCountCopy<totalCount)
    println("배가 부르다")
}
// eatUntilNotHungry(10,10)

// 문제8
fun killNthArmy(
    firstArmy:List<String>, secondArmy: List<String>, killNth: Int
): List<List<String>>?{
    if(firstArmy.size < killNth || secondArmy.size <killNth) return null
    else{
        val firstArmyTemp = mutableListOf<String>()
        val secondArmyTemp = mutableListOf<String>()
        for ((index, army)in firstArmy.withIndex()){
            if(index!=killNth)firstArmyTemp.add(army)
        }
        for((index, army)in secondArmy.withIndex()){
            if(index!=killNth) secondArmyTemp.add(army)
        }
        val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
        return result
    }

}
/*println(
    killNthArmy(
        firstArmy = listOf<String>("A", "B", "C", "D", "E"),
        secondArmy = listOf<String>("A", "B", "C"),
        killNth = 2
    )
)*/

// 문제9
fun gugudan(dan : Int){
    val numbers = mutableListOf<Int>()
    for (i in 1..9){
        // println(dan*i)
        numbers.add(dan*i)
    }
    println(numbers)
}
gugudan(3)

// 문제10
fun splitNumbers(
    firstIntList : List<Int>, secondList: List<Int>
):Map<String, List<Int>>{
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondList)

    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number->
        if(number%2 ==0) evenNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", evenNumber)
    result.put("홀수", oddNumber)
    return result
}

println(
    splitNumbers(
        listOf<Int>(1,2,3,4,5),
        listOf<Int>(6,7,8,9,10)
    )
)


