val numbers = intArrayOf(5,10,15)
// 값만 필요함
for(number in numbers){
    println(number)
}
println("---------------------------")
// 값, 인덱스 둘다 필요할 때
for((index, value) in numbers.withIndex()){
    println(index)
    println(value)
}
println("---------------------------")
for(index in 0..numbers.indices){
    println(index)
}
println("---------------------------")
// 본문에서 사용될 변수이름을 기본 제공으로 사용
numbers.forEachIndexed{ index, i->

}
println("---------------------------")
// 본문에서 사용될 변수이름을 변경해서 사용
numbers.forEachIndexed{ index, i->

}
