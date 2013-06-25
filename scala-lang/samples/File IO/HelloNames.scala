import io.Source

object HelloNames {
  def main(args: Array[String]) {

    val names = Source.fromFile("names.txt").getLines.toList

    names.foreach(name => println("Hello " + name + "!"))

  }
}