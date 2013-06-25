import sbt._
import sbt.Keys._

object SamplesBuild extends Build {

  lazy val root = Project("samples", file(".")).settings(

    scalaVersion := "2.10.2"

  )
}