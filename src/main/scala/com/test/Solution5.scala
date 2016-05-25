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

  def gcd(A: Array[Int], B: Array[Int]) : Int = {
    0
  }
}
