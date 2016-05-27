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
    if (A.length == 0 || B.length == 0) {
      1
    } else {
      val part = removeFactor(A.head, B)
      part._1*gcd(A.tail, part._2)
    }
  }

  def gcd(a: Int, b: Int) : Int = {
    if (b==0) a else gcd(b,a%b)
  }

  def removeFactor(a: Int, B: Array[Int]): (Int, Array[Int]) = {
    // remove as a factor for only one of the elements in B
    // e.j. a=2, b=(2, 5, 4, 34) => result=(1,5,4,34)
    if (B.isEmpty) {
      (1, B)
    } else {
      var temp = gcd(a, B.head)
      if (temp == 1) {
        val part = removeFactor(a, B.tail)
        (part._1, B.head +: part._2)
      } else {
        (temp, B.head / temp +: B.tail)
      }
    }
  }
}
