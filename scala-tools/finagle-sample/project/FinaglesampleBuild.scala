import sbt._
import sbt.Keys._

object FinaglesampleBuild extends Build {

  lazy val finaglesample = Project(
    id       = "finagle-sample",
    base     = file("."),
    settings = Project.defaultSettings ++ Seq(
      name                 := "finagle-sample",
      organization         := "ie.bash",
      version              := "0.1-SNAPSHOT",
      scalaVersion         := "2.10.2",
      resolvers ++= Seq(
        "Twitter Repo" at "http://maven.twttr.com/"
      ),
      libraryDependencies ++= Seq(
        "com.twitter" %% "twitter-server" % "1.0.1"
      )
    )
  )
}
