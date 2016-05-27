package com.test

import org.scalatest._

/**
  * Created by alberto.paz on 25/05/2016.
  */
class Solution5Test  extends FunSuite with Matchers {

  test("Two series: 2 2 3 3 25 and 8 1 6 170 have a gcd of 60") {
    assert(Solution5.gcd(Array(2,2,3,3,25), Array(8,1,6,170)) == 60)
  }

  test("Remove factor should remove the factor from the first element that divide in a one array") {
    Solution5.removeFactor(2, Array(2))._2 should equal(Array(1))
    Solution5.removeFactor(2, Array(2))._1 should equal(2)
  }


  test("Remove factor should remove the factor from the first element that divide") {
    Solution5.removeFactor(2, Array(2,5,4,34))._2 should equal(Array(1,5,4,34))
  }

}
