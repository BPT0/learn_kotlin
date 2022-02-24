// 기본자료형의 타입 캐스팅
val number: Int = 10
val numberString: String = number.toString()
println(numberString)
val StringToNumber: Int = numberString.toInt()
println(StringToNumber)

val numberF: Double = 10.5
val numberFString: String = numberF.toString()
val numberFInt: Int = numberF.toInt()

println(numberFInt)
// -> to타입이 오는 함수를 이용해서 형변환을 한다

// 상속한 클래스간의 캐스팅
// is - 타입을 체크
// - ture, false가 리턴
// - 스마트 케스팅을 해준다
// - var은 불가능 -> val 을 사용해야한다
open class Warrior1() { // 부모클래스, 슈퍼클래스
    fun attack() {
        println("복잡한 코드 + 공격")
    }
}

class DefenseWarrior1() : Warrior1() {
    fun defense() {
        println("방어")
    }
}

val warrior: Warrior1 = DefenseWarrior1()
// var로 선언 되면 값의 변경이 가능하기 때문에 안된다

// warrior.defense() -> 불가능, defense기능을 포기하고 warrior 타입이 되었기 때문
// 스마트 캐스팅
if (warrior is DefenseWarrior1) {
    println("YES")
    // 내가 만든 warrior를 if 블록 안에서는 defenseWarrior로 사용하게 해준다
    warrior.defense()
}

// as
// - 지정한 타입으로 캐스팅을 시도하고, 불가능한 경우에는 예외 발생
val warrior2 : DefenseWarrior1 = warrior as DefenseWarrior1
warrior2.defense()

// as?
val defenseWarrior1 = DefenseWarrior1()
val warrior1 = defenseWarrior1 as Warrior1

