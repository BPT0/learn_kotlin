// List
val numbers = listOf<Int>(1,2,3) // 안의 항목을 변경 불가
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2)) // 해당 값이 있는 인덱스를 반환
println(numbers.last())
println(numbers.first())
val numbers2 = mutableListOf<Int>(1,1,1,1,2,3) // 안의 항목을 변경 가능
println(numbers2.add(50))
println(numbers2)
numbers2.removeAt(0)
println(numbers2)
numbers2.addAll(2, listOf<Int>(100, 100))
// numbers2.replaceAll(2)
// println(numbers2)

// Set
val numbers3 = setOf<Int>(1,1,1,3,3,4)
println(numbers3.contains(1))
println(numbers3.containsAll(setOf<Int>(1,3)))

val numbers4 = mutableSetOf<Int>(1,1,1,3,3,4) // 여러개의 항목을 저장해도 같은 값은 한개로 축약해 저장
numbers4.remove(1)
println(numbers4)

// Map
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1)) // index가 아니라 key값을 불러서 호출한다
println(numbers5[2])
println(numbers5.getOrDefault(1, "default"))
println(numbers5.getOrDefault(3, "default"))
println(numbers5.get(3)) // map에 존재하지 않는 키로 value를 찾을 경우 null값이 나온다

val numbers6 = mapOf<Int, String>(Pair(1,"one"), Pair(2,"two"))

// Pair 쌍으로 저장을하는 함수
// println(numbers6) // map은 list와 set과 다르게 출력될때 ex){1=one, 2=two} 형식으로 출력된다