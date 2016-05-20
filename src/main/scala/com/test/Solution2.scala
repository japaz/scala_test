package com.test

object Solution2 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val T = 1
    for ( n <- 1 to T ) {
      val line = "YGYGRBRB"

      def accum(res: (Int, Int, Int, Int), x: Char) = {
        x match {
          case 'R' => (res._1 + 1, res._2, res._3, res._4)
          case 'G' => (res._1, res._2 + 1, res._3, res._4)
          case 'Y' => (res._1, res._2, res._3 + 1, res._4)
          case 'B' => (res._1, res._2, res._3, res._4 + 1)
        }
      }

      def checkPref(x: (Int, Int, Int, Int)) = {
        if (Math.abs(x._1-x._2) > 1 ||
          Math.abs(x._3-x._4) > 1) {
          false
        } else {
          x
        }
      }

      def checkTotal(x: (Int, Int, Int, Int)) : Boolean = {
        if (x._1 == x._2 && x._3 == x._4) {
          true
        } else {
          false
        }
      }

      val a = line.scanLeft((0, 0, 0, 0))(accum).
        map(checkPref).span(_ != false)

      if (a._2.length != 0) {
        println("False")
      } else if (
        a._1.last match {
          case b: (Int, Int, Int, Int) => checkTotal(b)
        }) {
        println("True")
      } else {
        println("False")
      }
    }
  }
}
