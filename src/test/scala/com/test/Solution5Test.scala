package com.test

import org.scalatest.FunSuite

/**
  * Created by alberto.paz on 25/05/2016.
  */
class Solution5Test  extends FunSuite {

  test("Two series: 2 2 3 3 3 25 and 8 1 6 170 have a gcd of 60") {
    assert(Solution5.gcd(Array(2, 2, 3, 4, 4, 25), Array(8, 1, 6, 170)) == 60)
  }

}
