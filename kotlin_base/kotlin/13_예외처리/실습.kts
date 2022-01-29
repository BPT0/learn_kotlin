import java.lang.Exception
import java.lang.IllegalArgumentException

val numbers = listOf<Int>(1, 2, 3)
try {
    numbers.get(5)
} catch (exception: Exception) {
    println(exception)
}
// 전체 익셉션으로 에러를 잡고 그에러를 출력해서
// 그아래에 애러를 입력해주면 된다

try {
    numbers.get(5)
} catch (exception: IllegalArgumentException) {
    // 발생한 예외와 예외 타입이 일치해야 catch문으로 예외를 잡을 수 있다
    println("예외 발생 A")
} catch (exception: ArrayIndexOutOfBoundsException) {
    println("예외 발생 B")
} finally {
    println("마지막!")
}

