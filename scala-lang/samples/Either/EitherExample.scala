object EitherExample {
  def main(args: Array[String]) {

    parseInput(readLine("Please enter a number: ")) match {
     case Right(num) => println("Successfully parsed "+num)
     case Left(errmsg) => println("Error: "+errmsg)
    }

    // instead of pattern matching we can 'fold in' functions
    val readResult = parseInput(readLine("Please enter a number: "))
    readResult.fold(handleError, foundInt)

  }

  // convention is that left = error case, right = it's alright
  def parseInput(input: String): Either[String, Int] =
    try {
      Right(input.toInt)
    } catch {
      case e: Exception => 
        Left("Couldn't parse "+input+" as an integer")
    }

  private def foundInt(num: Int) {
    println("Successfully parsed " + num)
  }

  private def handleError(errmsg: String) {
    println("Error: "+errmsg)
  }
}