// 부생성자(Secondary Constructor)
// - constructor 키워드를 생략할 수 없다
// - 주생성자에는 객체를 만들기 위한 필수 조건이 있다면, 부생성자에는 객체를 만들기 위한 옵션 조건이다
// - 부생성자에는 주생성자에서 필요한 조건을 포함하고 있어야 한다( 파라미터를 포함하고 있어야된다)
// - 부생성자는 주생성자에게 생성을 위임해야한다

class User6 constructor(name: String) {
    var age: Int = 0
    val name: String
    var nickname : String = ""
    init {
        println("init")
        this.name = name
        this.age = 100
    }
    // 부생성자는 클래스명 우측에 올수 없다 -> 클래스의 본문에 있어야 한다
    constructor(name: String, age: Int): this(name){ //User6
        println("second")
        this.age = age
    }
    // 부생성자는 복수개 존재할 수 있다
    constructor(name:String, age:Int, nickname: String): this(name){
        println("third")
        this.age = age
        this.nickname = nickname
    }
}
/*val user6 = User6(name = "가나다")
println(user6.name)*/
val user6_2 = User6("가나다라", 50)
println(user6_2.age)

// 실행순서
// 부생성자 호출 -> 부생성자 안에있는 주생성자 호출 -> init블록 호출 -> 부생성자 본문 설명
// 클래스 속성에서 초기화를 시켜주지 않아도 되는 이유
//  - 초기화블록에서 초기화를 보장해주기 때문 -> 클래스가 생성될때 초기화블록은 무조건 실행된다
//  - 초기화블록에 없는 속성은 초기화를 선언해주어야 한다

class User7{
    val age : Int
    val name: String
    constructor(age:Int, name:String){
        this.age = age
        this.name = name
    }
}
val user7 = User7(10, "가가가")
println(user7.age)
// 주생성자가 없는것처럼 보이고 부생성자만 있을때 부생성자가 주생성자 처럼 보인다
// -> 부생성자가 맞다!!
// -> 주생성자는 코틀린이 자동으로 만들어 준다
// -> 주생성자가 없기 때문에 this()생성자를 이용해 생성을 위임할 필요가 없다
