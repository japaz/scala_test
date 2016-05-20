var coefficients:List[Int] = List(1,2,3)
var powers:List[Int] = List(1,2,3)
var x:Double = 2

(coefficients, powers).zipped.map(_*Math.pow(x,_)).sum


