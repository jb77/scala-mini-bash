import sbt._
import Keys._
import org.scalatra.sbt._
import org.scalatra.sbt.PluginKeys._

object ScalatraSampleBuild extends Build {
  val Organization    = "ie.bash"
  val Name            = "Scalatra Sample"
  val Version         = "0.1.0-SNAPSHOT"
  val ScalaVersion    = "2.10.2"
  val ScalatraVersion = "2.2.1"

  lazy val project = Project (
    "scalatra-sample",
    file("."),
    settings = Defaults.defaultSettings ++ ScalatraPlugin.scalatraSettings ++ Seq(
      organization := Organization,
      name         := Name,
      version      := Version,
      scalaVersion := ScalaVersion,
      resolvers += Classpaths.typesafeReleases,
      libraryDependencies ++= Seq(
        "org.scalatra"            %% "scalatra"         % ScalatraVersion,
        "org.scalatra"            %% "scalatra-scalate" % ScalatraVersion,
        "org.scalatra"            %% "scalatra-specs2"  % ScalatraVersion       % "test",
        "ch.qos.logback"          %  "logback-classic"  % "1.0.6"               % "runtime",
        "org.eclipse.jetty"       %  "jetty-webapp"     % "8.1.8.v20121106"     % "container",
        "org.eclipse.jetty.orbit" %  "javax.servlet"    % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
      )
    )
  )
}
