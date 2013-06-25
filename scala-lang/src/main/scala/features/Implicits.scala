package features

object Implicits extends App{

  implicit class FancyPantsString(target: String) {
    def flipReverseIt = target.reverse
  }

  println("hello world".flipReverseIt)

  trait StringCodec {
    def encode(str: String): String
  }

  class ReverseStringCodec extends StringCodec {
    def encode(str: String) = str.reverse
  }

  implicit val reverser = new ReverseStringCodec

  def doSomethingWithAString(str: String)(implicit codec: StringCodec) = {
    codec.encode(str)
  }

  println(doSomethingWithAString("implicit things"))
}
