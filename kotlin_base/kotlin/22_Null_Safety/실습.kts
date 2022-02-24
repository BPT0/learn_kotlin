// ?
val number: Int = 10 // Non-Nullable Int
val number : Int? = null // Nullable Int

// !!
val nullableNumberlist: List<Int?> = listOf<Int?>(1,2,3)
var result: Int = 0
nullableNumberlist.forEach {
    //result += it!!
}
// -> 정말 필요한 경우에만 사용을 해야한다

// ?. (safe call)
val text: String? = null
println(text?.length)
// println(text.length) // -> NullPointExecption 이 발생 해야함

// !!.
// println(text!!.length)

// !! !!. 은 널포인트 오류를 야기하므로 주로 사용하지 않음

// as?
val numberText: String = "123"
val number: Int = numberText as Int
// println(number)

// ??: 엘비스 연산
val text2: String? = "123"
val nullText : String? = null

var len1 : Int =  if(text2!=null) text2.length else 0
var len2 : Int = text2?.length ?:0
