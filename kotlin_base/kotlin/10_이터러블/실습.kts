// Range
val range1 = 1..10
println(range1)
val range2 = 1 until 10
println(range2)
val range3 = 'A'..'Z' // 코틀린은 알파벳의 순서를 알고있다
println(range3)

// Progression
val range4 = 1..10 step 2 // {1,3,5,7,9}
println(range4)

val range5 = 10 downTo 1 step 2
println(range5)
// STEP
// - 특징: step의 값과 상관없이 첫번째는 무조건 index 0부터 시작한다

// Collection
val collection1 = listOf<Int>(1,2,3,4,5) // listOf가 정의 되지 않아있음

