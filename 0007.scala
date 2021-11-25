object Main extends App {
  lazy val primeList = LazyList.from(1).filter(isPrime)
  val answer = primeList(10000)

  def isPrime(n: Int) = n < 2 match {
    case true => false
    case false => isPrimeHelper(n, 2)
  }

  def isPrimeHelper(n: Int, factor: Int): Boolean =
    if (n == factor) true
    else n % factor == 0 match {
      case true => false
      case false => isPrimeHelper(n, factor + 1)
    }

  println(answer)
}
