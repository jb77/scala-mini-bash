import sbt._
import sbt.Keys._

object AkkasampleBuild extends Build {

  lazy val akkasample = Project(
    id = "akka-sample",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "akka-sample",
      organization := "ie.bash",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1"
    )
  )
}
