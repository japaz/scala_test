def gcd(x: Int, y: Int): Int = {
  if (x == y) x

  x > y ? 4 : 1

  val (max, min) =  if (x > y) (x,y) else (y,x)

  val div = max / min
  val rest = max % min
}