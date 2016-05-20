package com.test

/**
  * Created by alberto.paz on 18/05/2016.
  */
object Solution3 {

  def numberOfWays(X:Int,N:Int):Int = {
    // Compute the answer in this function over here
    // It is fine to define new functions as and where required
    val numbers : Array[Int] = Stream.from(1).map(Math.pow(_,N)).takeWhile(_ < X).map(_.toInt).toArray
    val n = numbers.length

    val subset = Array.ofDim[Boolean](X+1, n+1)

    for (i <- 0 to n) {
      subset(0)(i) = true
    }

    for (i <- 1 to X) {
      subset(i)(0) = false
    }

    for (i <- 1 to X; j  <- 1 to n ) {
      subset(i)(j) = subset(i)(j-1)
      val number : Int = numbers(j-1)
      if (i >= number) {
        subset(i)(j) = subset(i)(j) || subset(i-number)(j-1)
      }
    }

    println(subset.map(_.mkString(" ")).mkString("\n"))

    subset(X).count(_ == true)
  }



  def main(args: Array[String]) {
    println(numberOfWays(readInt(),readInt()))
  }
}