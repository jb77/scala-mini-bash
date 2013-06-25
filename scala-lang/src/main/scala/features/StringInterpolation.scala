package features

object StringInterpolation extends App {

  val magicNumber = 4

  println("Magic Number: " + magicNumber)

  println(s"Magic Number: $magicNumber")

  println(f"Magic Number: $magicNumber%10d")


  implicit class ReverseyContext(val sc: StringContext) extends AnyVal {
    def n(args: Any*): Int = sc.s(args:_*).toInt
  }

  println(n"$magicNumber" + 4)

}
