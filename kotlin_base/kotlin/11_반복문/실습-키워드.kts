/*//break
for(i in 1..3){
    println("i: "+i)
    for(j in 1..3){
        if(j==2)break
        else println("j: "+j)
    }
}
println("---------------------------------")
// label - break, continue
// label의 이름@ 를 for문 앞에 적는다
// 사용할때 (break, continue)@라벨의 이름
loop@for(i in 1..3){
    println("i: "+i)
    for(j in 1..3){
        if(j==2)break@loop
        else println("j: "+j)
    }
}*/
// continue
for(i in 1..3){ // i반복문
    println("i: "+i)
    for(j in 1..3){ // j반복문
        if(j==2)continue // 구문 1
        else println("j: "+j) // 구문 2
    }
// i:1 -> (j1/구문1 -> j1/구문2 -> j2/구문1 -> j3/구문1 -> j3->구문2)
}
println("continue+label-----------------------------")
loop@for(i in 1..3){
    println("i: "+i)
    for(j in 1..3){
        if(j==2)continue@loop
        else println("j: "+j)
    }
}
// return
fun returnFunction():Unit{
    for(i in 1..3){ // i반복문
        println("i: "+i)
        for(j in 1..3){ // j반복문
            if(j==2)return // 구문 1
            else println("j: "+j) // 구문 2
        }
    }
}
returnFunction()
println("foreach+label-----------------------------")
// foreach는 continue와 break 사용 불가
// 기본 라벨명 @foreach를 갖고 있다
listOf(1,2,3).forEach loop@{
    if(it==2)return @loop
    else println(it)
}
