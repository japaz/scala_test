package com.test

import scala.io.StdIn._

/**
  * Created by alberto.paz on 25/05/2016.
  */
object Solution5 {

  def main(args: Array[String]) {
    // Read input from command line
    val aN:Int = readInt();
    val a = readLine.split(" ").map( x => x.toInt);
    val bN:Int = readInt();
    val b = readLine.split(" ").map( x => x.toInt);
    var aB: BigInt = 1;
    var bB: BigInt = 1;
    for(i<-a){
      aB*=i;
    }
    for(i<-b){
      bB*=i;
    }
    //if(aB > bB){
    println(gcd(aB,bB)%1000000007);
    //}else{
    //  println(gcd(bB,aB)%1000000007);
    //}
  }
  // Method to get GCD
  def gcd(a: BigInt, b: BigInt) : BigInt = {
    if (b==0) a else gcd(b,a%b)
  }
}
