package features

import scala.util.Random

trait LoggingSupport {
  def log(message: String) = println(message)
}

trait RandomNumberSupport {
  def nextInt = Random.nextInt
}

object Traits extends App with LoggingSupport with RandomNumberSupport {
  log(nextInt.toString)
}
