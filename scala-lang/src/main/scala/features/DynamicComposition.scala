package features

object DynamicComposition extends App {

  trait DatabaseThingy {
    def doDatabaseThing = {
      // save all the data and stuff
      Thread.sleep(5000)
    }
  }

  class ThingyThatDoesStuff extends DatabaseThingy {
    def save = {
      doDatabaseThing
    }
  }

  val thingy = new ThingyThatDoesStuff

  // delay
  thingy.save

  println("Saved")
}

//  trait StubDatabaseThingy extends DatabaseThingy {
//    override def doDatabaseThing {
//      // pretend to save all the data
//    }
//  }
