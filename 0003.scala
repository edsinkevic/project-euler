//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?

object Main extends App {
  val n = 600851475143L
  def solve(n: Long, divisor: Long): Long =
    n match {
      case 1 => divisor - 1
      case n => solve(reduce(n, divisor), divisor + 1)
    }

  def reduce(n: Long, i: Long): Long =
    if (n % i == 0) reduce(n / i, i)
    else n

  val answer = solve(n, 2)

  assert(answer == 6857)

  println(answer)
}
