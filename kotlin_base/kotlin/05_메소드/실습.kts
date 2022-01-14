var number100: Int = 100

// 함수를 선언하는 방법
fun plusNumbers(first_num: Int, second_num: Int): Int{

    val result: Int = first_num + second_num;
    return result;
}

// 함수를 호출하는 방법
plusNumbers(first_num = 10, second_num = 20)
plusNumbers(10, 20) // -> 30

val result : Int = plusNumbers(first_num = 5, second_num = 7)
println(result)

// 기본값이 있는 함수
fun plusNumbersWithDefault(first_num: Int, secont_Num: Int = 10):Int{
    return first_num + secont_Num;
}
val result2:Int = plusNumbersWithDefault(first_num = 10)
println(result2)
val result3:Int = plusNumbersWithDefault(first_num = 10, secont_Num = 20)
println(result3)

// 반환값이 없는 함수를 선언하는 방법 - 반환형으로 Unit을 작성, 반환형 없애기, 마지막에 return만 작성
fun plusNumberWithNoReturn(first_num: Int, second_num: Int): Unit{
    val result: Int = first_num + second_num
    println(result)
}
fun plusNumberWithNoReturn2(first_num: Int, second_num: Int){
    val result: Int = first_num + second_num
    println(result)
}
fun plusNumberWithNoReturn3(first_num: Int, second_num: Int){
    val result: Int = first_num + second_num
    println(result)
    return
}
plusNumberWithNoReturn3(100, 200)
// 함수선언을 간단하게 하는 방법
fun shortPlusNumber(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10: Int = shortPlusNumber(firstNum = 10, secondNum = 100)
println(result10)

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit{
    for (number in numbers){
        println(number)
    } // numbers에 들어온 값을 하나하나 돌면서 println을 진행한다
}
plusMultipleNumbers(1, 2, 3, 4, 5)

number100 = 200
println(number100)