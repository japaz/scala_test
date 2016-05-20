package com.test

import scala.io.{BufferedSource, Source}

/**
  * Created by alberto.paz on 10/05/2016.
  */
object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
//    val x = scala.io.StdIn.readLine()
//    val y = scala.io.StdIn.readLine()
    val file: BufferedSource = Source.fromFile("input15.txt")
    val lines: Iterator[String] = file.getLines()

    val x = lines.next()
    val y = lines.next()

    val pre = prefix(x, y, 0)
    print(pre +" ")
    println(x.substring(0,pre))
    print((x.length - pre) + " ")
    println(x.substring(pre))
    print((y.length - pre) + " ")
    println(y.substring(pre))
  }

  def prefix(x: String, y: String, common: Int) : Int = {
    if (x.length == common || y.length == common || x.charAt(common) != y.charAt(common)) {
      common
    } else {
      prefix(x, y, common+1)
    }
  }
}
