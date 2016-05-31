package com.test

import scala.runtime.ScalaRunTime._


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
      val (sub_gcd, rest) = removeFactor(A.head, B)
      sub_gcd*gcd(A.tail, rest)
    }
  }

  def gcd(a: Int, b: Int) : Int = {
    if (b==0) a else gcd(b,a%b)
  }

  def removeFactor(a: Int, B: Array[Int]): (Int, Array[Int]) = {
    // remove as a factor for all of the elements in B
    // e.j. a=4, b=(2, 2, 4, 34) => result=(1,1,4,34)
    if (a == 1 || B.isEmpty) {
      (1, B)
    } else {
      val cal_gcd = gcd(a, B.head)
      val part = removeFactor(a / cal_gcd, B.tail)
      (cal_gcd * part._1, B.head / cal_gcd +: part._2)
    }
  }
}
