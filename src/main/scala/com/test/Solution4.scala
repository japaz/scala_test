package com.test

/**
  * Created by alberto.paz on 23/05/2016.
  */
object Solution4 {

  def removeDuplicates(str: String): String = {
    str.distinct
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val str = scala.io.StdIn.readLine()
    println(removeDuplicates(str))
  }
}
