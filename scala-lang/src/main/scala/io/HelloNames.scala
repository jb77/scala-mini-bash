import scala.io.Source

object HelloNames extends App {

  val names = Source.fromFile("src/main/scala/io/names.txt").getLines

  names.foreach(name => println(s"Hello $name!"))

}