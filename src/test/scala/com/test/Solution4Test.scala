package com.test

import org.scalatest.FunSuite

/**
  * Created by alberto.paz on 23/05/2016.
  */
class Solution4Test extends FunSuite {
  test("If one duplicate is found remove it") {
    assert(Solution4.removeDuplicates("aabc") == "abc")
  }

  test("If multiple duplicates are found remove then") {
    assert(Solution4.removeDuplicates("ccbabacc") == "cba")
  }
}
