//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

object Main extends App {
  val answer = LazyList.from(20).find(divisibleUntil(_, 20)).get
  def divisibleUntil(subject: Int, until: Int): Boolean = until match {
        case 0 => true
        case until => if(subject % until == 0) divisibleUntil(subject, until - 1) else false
  }
    println(answer)
}
