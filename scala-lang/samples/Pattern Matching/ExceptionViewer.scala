import java.lang.NullPointerException
import java.lang.Exception
import java.io.FileNotFoundException

object ExceptionViewer {
  def main(args: Array[String]) {
    val latestExceptions = List(
      new Exception("Something happened in the bytes"), 
      new FileNotFoundException("Couldn't find input file"),
      new NullPointerException("Can't de-reference pointer")
    )

    val displayMessages = latestExceptions.map {
      case ex: FileNotFoundException => "[RED] File problem: "+ex.getMessage()
      case ex: NullPointerException => "[RED] Runtime null pointer problem: "+ex.getMessage
      case ex => "[AMBER] General problem: "+ex.getMessage()
    }

    println(displayMessages.mkString(",\n"))
  }
}