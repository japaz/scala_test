package com.test

import org.scalatest.FunSuite

class Solution3Test extends FunSuite {

  test("Number 10 and power 2 has 1 way") {
    assert(Solution3.numberOfWays(10, 2) == 1)
  }

  test("Number 100 and power 2 has 3 ways") {
    assert(Solution3.numberOfWays(100, 2) == 3)
  }

  test("Number 400 and power 2 has 55 ways") {
    assert(Solution3.numberOfWays(400, 2) == 55)
  }
/*
  test("Number 800 and power 2 has 561 ways") {
    assert(Solution3.numberOfWays(800, 2) == 561)
  }
*/
}
