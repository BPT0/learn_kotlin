// 상속을 사용하기전
class Warrior(){
    fun attach(){
        println("복잡한 코드 + 공격")
    }
}
class DefenseWarrior(){
    fun attach(){
        println("복잡한 코드 + 공격")
    }
    fun defense(){
        println("방어")
    }
}
class HardAttackWarrior(){
    fun attack(){
        println("복잡한 코드 + 공격")
    }
    fun hardAttack(){
        println("강하게 공격")
    }
}

// 상속을 사용
open class Warrior1(){ // 부모클래스, 슈퍼클래스
    fun attack(){
        println("복잡한 코드 + 공격")
    }
}

class DefenseWarrior1():Warrior1(){
    fun defense(){
        println("방어")
    }
}

val defenseWarrior: DefenseWarrior1 = DefenseWarrior1()
defenseWarrior.defense()
defenseWarrior.attack()


