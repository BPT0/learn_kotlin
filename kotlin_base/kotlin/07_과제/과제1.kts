// 1번
var num1 : Int = 10
var num2 : Int = 20
var iseQual = if(num1 == num2) true else false
println(iseQual)
// 자료형이 다르면 비교연산자를 사용할수 없다
/*if(num1 == num2){
    var isequal : Boolean = true
    println(isequal)
}else{
    var isequal : Boolean = false
    println(isequal)
}*/

// 2번
/*var num3 : Int = 2
var num4 : Int = num3 *2
println(num3)
println(num4)*/

// 3번
/*fun checkGrade(score : Int): String{
    /*if(score >= 90) return "A학점"
    else if(score>=80) return "B학점"
    else if(score>=70) return "C학점"
    else return "F학점"*/
    when(score){
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..79 -> return "C학점"
        else -> return "F학점"
    }
}
var num5 : String = checkGrade(60)
println(num5)*/

// 4번
/*fun gradeTest(correctAnswer: Int): Int?{
    return correctAnswer*5
}
fun gradeTest2(correectAnswer: Int):Int = correectAnswer *5
println(gradeTest(10))
println(gradeTest2(10))*/

fun plusNum(firstNum:Int?, secondNum:Int?):Int{
    if(firstNum == null){
        return firstNum =0
    }
    if(secondNum == null){
        return secondNum = 0
    }
    return firstNum+secondNum
}

