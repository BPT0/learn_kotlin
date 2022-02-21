// 오버로딩
class Sum{
    fun sum(): Int{
        return 10
    }

    fun sum(num1: Int){
        return num1 + 20
    }

    fun sum(num1: Int, num2: Int): Int {
        return num1+num2+10
    }
}

val sum = Sum()
println(sum.sum())
println(sum.sum(10))
println(sum.sum(10, 20))
