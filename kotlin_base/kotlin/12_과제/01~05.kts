// 문제1
// 1. 주어진 문자를 N번 반복해서 함수를 만들어 보자
fun repeatText(text: String, n: Int){
    for (i in 0..n-1) println(text)
    for (i in 1..n) println(text)
    for (i in 0 until n) println(text)
}
// repeatText("안녕", 2)
// 수정사항
// :Unit 생략, 문자 String으로 받음, for문 1줄로 요약, 조건식 변수i로 설정

// 문제2
fun sumRepeat(n:Int):Int{
    var sum: Int = 0
    for(i in 1..n) sum+=i
    return sum
}
// println(sumRepeat(10))
// 수정사항 - 1부터 반복 시작

// 문제3
fun sumRepeatSevenMul():Int{
    var sum: Int =0
    for (i in 1..100){
        if(i%7 == 0){
            sum+=i
        }
    }
    return sum
}
// sumRepeatSevenMul()
// 질문- 출력을 하지 않았는데 출력이 되는 이유?

// 문제4
fun maxHundredExit(n: Int){
    var sum: Int = n
    /*for (value in sum..100) {
        if (sum == 100) {
            break
        }
        sum++
    }*/
    while(sum<100) sum++
    return
}
// maxHundredExit(99)
// 수정사항- while문으로 수정
// 함수안에서 받는 인자는 기본적으로 val 이다 값을 바꿀수 없다

// 문제5
fun checkPassOrNot(records: List<Int>):BooleanArray{
    val resultArray = BooleanArray(records.size,{false})
    records.forEachIndexed { index, scroe ->
        if(scroe>=80) resultArray[index]= true
    }
    /*for ((index, number) in resultArray.withIndex()){
        if(records.get(index)>=80){
            resultArray[index] = true
        }
    }*/
    return resultArray
}
/*var resultArray = Array<Boolean>(10, {false})
val records = listOf<Int>(70,71,72,77,78,79,80,82,90,99)
passToFail(resultArray, records)
println(resultArray)*/
val result = checkPassOrNot(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
result.forEach {
    println(it)
}

// 배열의 자료형은 함수에 매개변수나 반환값으로 적을때는 BooleanArray 와 같은
// 형식으로 작성되어야 한다
