package com.test

/**
  * Created by alberto.paz on 25/05/2016.
  */
object Solution5 {


  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val N : Int = scala.io.StdIn.readInt()
    val A : Array[Int] = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val M : Int = scala.io.StdIn.readInt()
    val B : Array[Int] = scala.io.StdIn.readLine().split(" ").map(_.toInt)

    println(gcd(A, B))
  }

  def gcd(A: Array[Int], B: Array[Int]): Int = {
    if (A.length == 1) {
      A.head
    } else {
      gcd(A.tail, removeFactor(A.head, B))
    }
  }

  def gcd(a: Int, b: Int) : Int = {
    if (b==0) b else gcd(b,a%b)
  }

  def removeFactor(a: Int, B: Array[Int]): Array[Int] = {
    // remove as a factor for only one of the elements in B
    // e.j. a=2, b=(2, 5, 4, 34) => result=(1,5,4,34)
    B
  }
}
