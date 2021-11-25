//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

//Find the largest palindrome made from the product of two 3-digit numbers.

object Main extends App {
    val answer = (for {a <- 100 to 999; b <- 100 to 999 if isPalindrome(a * b)} yield a * b).max

    def isPalindrome(x: Int) = x.toString.reverse == x.toString

    println(answer)
}
