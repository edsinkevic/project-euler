
object Main extends App {
    val answer = square((1 to 100).sum) - (1 to 100).map(x => x * x).sum
    def square(x: Int): Int = x * x
    println(answer)
}
