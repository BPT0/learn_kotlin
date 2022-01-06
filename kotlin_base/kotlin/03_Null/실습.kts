val number: Int? = null // null이 들어갈 수 있는 변수 -> nullable 함
// val number2 : Int = null // null이 들어갈 수 없는 변수 -> non-null

val num2: Int = 2 + 5
val num3: Int = 10
val num4 : Int = num2 + num3
println(num4)

// 변수 선언 + 할당
var number5: Int = 10
number5 = 100

var number2: Int? = 2 + 5
var number3: Int? = 10
number2 = 1000
// number2 = null // NPE발생!
println(number2)

// val number4: Int? = number2 + number3 // 어떻게 될까?
// nullable 타입이기 때문에/ 정수인지 null타입인지 구분할수 없기 때문에 / + 연산을 할 수 없다
val number4: Int? = number2!! + number3!!
println(number4)
// !!로 null이 아님을 개발자가 보장 할수 있다
// 하지만 실제로 null인 경우에는 NPE(NullPointException이 발생할 수 있다)
// 결론 : 정말 100% 확신이 있는 경우가 아니면 사용하지 말자!!

// warning: condition 'null == 5' is always 'false'
// nulll을 대상으로 비교연산은 가능하다
// nulll은 값 뿐만 아니라 상태도 나타내기 때문에 아래와 같은 연산이 가능하다
if(null == 5){
    println("same")
}else{
    println("not same")
}
if(null == null){ // 둘다 null상태라면 같다고 본다
    println("same")
}else{
    println("not same")
}