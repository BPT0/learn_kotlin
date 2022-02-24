open class Warrior(
    var health: Int, val power: Int, var defence: Int, var exp: Int
) {
    // , val level: Int = 0 // level은 보류
    init {
        println("Warrior 생성")
        if (health != 0) println("Warrior 아직 살아 있습니다. 체력:$health")
        else println("Warrior 죽었습니다")
    }

    fun attack(monster: Monster) {
        // 워리어를 공격할지 나이트를 공격할지 모름?
        // 워리어or나이트 객체에 접근해 체력or방어력을 1씩 감소
        if(warrior.exp>=3){
            levelUp()
        }
        if (monster.health > 1) {
            if (monster.defence > 0) {
                monster.defence -= this.power
                println(
                    "monster가 아직 살아 있습니다. 체력: ${monster.health}" +
                            ", 방어력:${monster.defence}"
                )
                return
            }
            monster.health -= warrior.power
            println("monster가 아직 살아 있습니다. 체력: ${monster.health}")
        } else {
            monster.health -= this.power
            if (monster.health == 0) {
                this.exp++
                return
            }
            println("monster가 죽었습니다")
        }
    }

    fun levelup():Knight{

    }
}

class Knight construcotr(warrior:Warrior):Warrior(
    var health: Int, var power: Int, var defence: Int
){
    // 하드어택 기능 -> 체력 3이상 필요
    init {
        println("Knight 로 진화")
        if(health!=0) println("Knight 아직 살아 있습니다. 체력:$health")
        else println("Knight 죽었습니다")
    }

    fun hardAttack(monster:Monster){
        if(health>=3){
            if (monster.health > 1) {
                if (monster.defence > 0) {
                    monster.defence -= this.power*2
                    println(
                        "monster가 아직 살아 있습니다. 체력: ${monster.health}" +
                                ", 방어력:${monster.defence}"
                    )
                    return
                }
                monster.health -= this.power*2
                println("monster가 아직 살아 있습니다. 체력: ${monster.health}")
            } else {
                monster.health -= this.power*2
                println("monster가 죽었습니다")
            }
        }
        else{
            println("강한공격을 할 체력이 부족 체력: ${this.health}")
        }
    }
}

class Monster(
    var health: Int, val power: Int, var defence: Int
) {
    init {
        println("Monster 생성")
        if (health != 0) println("Monster 아직 살아 있습니다. 체력:$health")
        else println("Monster는 죽었습니다")
    }
    // 몬스터 - 어택기능 : 워리어, 나이트 공격할때 데미지(현재1로 테스트) 줌
    // 공격받은 워리어 나이트 - 생존여부, 현재 체력 출력 + (죽으면 체력표시 x)
    fun attack(warrior: Warrior) {
        // 워리어를 공격할지 나이트를 공격할지 모름?
        // 워리어or나이트 객체에 접근해 체력or방어력을 1씩 감소
        if (warrior.health > 1) {
            if (warrior.defence > 0) {
                warrior.defence -= this.power
                println(
                    "Warrior가 아직 살아 있습니다. 체력: ${warrior.health}" +
                            ", 방어력:${warrior.defence}"
                )
                return
            }
            warrior.health -= this.power
            println("Warrior가 아직 살아 있습니다. 체력: ${warrior.health}")
        } else println("Warrior는 죽었습니다")
    }

    fun attack(knight: Knight) {
        // 워리어를 공격할지 나이트를 공격할지 모름?
        // 워리어or나이트 객체에 접근해 체력or방어력을 1씩 감소
        if (knight.health > 1) {
            if (knight.defence > 0) {
                knight.defence -= this.power
                println(
                    "knight가 아직 살아 있습니다. 체력: ${knight.health}" +
                            ", 방어력:${knight.defence}"
                )
                return
            }
            knight.health -= this.power
            println("knight가 아직 살아 있습니다. 체력: ${knight.health}")
        } else println("knight가 죽었습니다")
    }
}

// 체력 공격력, 방어력(객체 생성시 지정 필요)
// 죽음 - health =0 이면 죽은 상태로 출력되야 한다
val monster1 = Monster(2, 1, 0)
val monster2 = Monster(2, 1, 0)
val monster3 = Monster(2, 1, 0)

// 몬스터가 생성될때 - 출력: 몬스터의 생존여부,체력
// 방어력있으면 방어력도 표시
// 워리어 ->몬스터 공격시 - 출력: 몬스터의 생존여부,체력(죽으면 체력표시 x)
// 몬스터 ->워리어 공격시 - 출력: 워리어 생존여부(죽으면 체력표시 x)
// 죽은 오브잭트 공격시 생존여부 표시(체력표시x)
// 몬스터 - 어택기능 : 워리어, 나이트 공격시 데미지(1로설정) 줌

val warrior = Warrior(3, 1, 2, 0)
/*monster.attack(warrior)
monster.attack(warrior)
monster.attack(warrior)
monster.attack(warrior)
monster.attack(warrior)*/

// 상속 기능 필요
// 워리어 : 특정 마리수(3마리) 이상 처치시 나이트로 레벨업
// 워리어가 3마리 잡으면 나이트로 바뀜 -> 형변환
// 나이트 - 하드어택 기능: 사용하기 위해선 체력 3이상 필요, 강한 공격:기본공격2배
// 워리어 레벨업하는 반복문 ?? 함수로 몬스터 3마리 잡으면 워리어로 진화
warrior.attack(monster1)
warrior.attack(monster1)
warrior.attack(monster2)
warrior.attack(monster2)
warrior.attack(monster3)
warrior.attack(monster3)

// 진화를하고 객체를 지정하면 강한공격 메소드 사용불가 해결점?

// 풀이
// 데미지가 0이상이면 hp감소 x
// 생존여부 불린타입 변수로 구분
// 인스턴스를 클래스 내에서 선언하여 세터개터 선언 하여 조건에따라 작업시행
// 몬스터 처치시 경험치 표시
// 나이트의 생성자에서 워리어를 받는다 - init에서 warrior에서 받은 값을 그대로 초기화 한다
// 에너지 - 어택할때마다 에너지가 1씩 증가
// 함수도 오버라이드 하려면 open으로 열어야 한다
// 공격력을 일시적으로 증가*감소 시켜 하드어택을 구현
// 워리어 -> 나이트 레벨업 반복문
    // 킬카운트를 특정수 이하로 두어서 레벨업을 진행
    // @loop를 활용하여 반복문 탈출
