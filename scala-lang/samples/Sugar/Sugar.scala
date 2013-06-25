object Sugar {
  def main(args: Array[String]) {

    println(formatMessage("James"))
    println(formatMessage(name = "Will"))
    println(formatMessage())

  }

  def formatMessage(name: String = "there") = {
    if (name == "Will") {
      "Hello Boss!"
    } else {
      "Hello " + name + "!"
    }    
  }
}