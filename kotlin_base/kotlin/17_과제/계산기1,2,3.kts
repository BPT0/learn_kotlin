/*
val add: (Int, Int) -> Int = { n1, n2 ->
    n1 + n2
}

val sub: (Int, Int) -> Int = { n1, n2 ->
    n1 - n2
}

val mul: (Int, Int) -> Int = { n1, n2 ->
    n1 * n2
}

val div: (Int, Int) -> Int = { n1, n2 ->
    n1 / n2
}

var i = 0
while (i < 1) {
    println(add(1, 5))
    println(sub(1, 5))
    println(mul(2, 5))
    println(div(10, 5))
    i++
}
*/

// 계산기 1번 모법 답안
/*class Calculator1 {
    var result: Int = 0
        set(value) {
            field = value
            println("중간 계산 값: " + field)
        }

    fun sum(iNum: Int) {
        result += iNum
    }

    fun sub(iNum: Int) {
        result -= iNum
    }

    fun mul(iNum: Int) {
        result *= iNum
    }

    fun div(iNum: Int) {
        result /= iNum
    }
}

val calculator1 = Calculator1()
calculator1.sum(10)
calculator1.div(2)
calculator1.mul(3)
println(calculator1.result)*/

// 계산기 2번 모법 답안
/*class Calculater2(val initalValue: Int = 0) {
    var result: Int
        set(value) {
            field = value
            println("중간 계산 값: " + field)
        }

    init {
        this.result = initalValue
    }

    fun calculate(opt: Char, num: Int) {
        when (opt) {
            '+' -> this.result += num
            '-' -> this.result -= num
            '*' -> this.result *= num
            '/' -> this.result /= num
            else -> println("잘못된 연산 입니다")
        }
    }
}

val calculator2 = Calculater2(0)
calculator2.calculate('+', 10)
calculator2.calculate('-', 8)
calculator2.calculate('*', 2)
calculator2.calculate('/', 2)
println(calculator2.result)*/

/*class Calculater (val initNum: Int = 0){
    fun calculate(opt: Char, num: Int){
        if(opt == '+' || opt == '-' ||
            opt == '*' || opt == '/'){
            when(opt){
                '+'->{
                    println(initNum+num)
                }
                '-'->{
                    println(initNum-num)
                }
                '*'->{
                    println(initNum*num)
                }
                '/'->{
                    println(in itNum/num)
                }
            }
        }else{
            println("잘못된 연산 입니다")
        }
    }
    fun calculate2(function: (Char, Int) -> Int, function: (Char, Int) -> Int){
        // 더하기
        // 빼기

    }
}
var i: Int = 0
val calculater = Calculater(5)
while (i<1){
    calculater.calculate('+', 10)
    calculater.calculate('-', 10)
    calculater.calculate('*', 2)
    calculater.calculate('/', 2)
    i++
}*/

// 계산기 3번 모법 답안
class Calculater3 {
    var result: Int = 0

    fun calcualte(opts: List<Char>, iNum: List<Int>) {
        opts.forEachIndexed { index, opt ->
            this._calculate(opt, iNum[index])
        }
    }

    fun _calculate(opt: Char, num: Int) {
        when (opt) {
            '+' -> this.result += num
            '-' -> this.result -= num
            '*' -> this.result *= num
            '/' -> this.result /= num
            else -> println("잘못된 연산 입니다")
        }
    }
}

val calculater3 = Calculater3()
calculater3.calcualte(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculater3.result)
/*1. mapOf 사용
2. 리스트 안의 Any타입항목이 있는배열
[(Any, Any) (Any, Any)] -> 실제
[(Char, Int) (Char, Int)] -> 기대*/
// 1번방법으로는 해결 불가능 2번방법으로는 해결가능하지만 타입변환을 배우지 않음
// ['+', '-'], [10, 20, 30]

