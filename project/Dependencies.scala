import sbt._

object Dependencies {

  val scalaTestVersion = "3.0.9"

  val scalaTest = Seq(
    "org.scalactic" %% "scalactic" % scalaTestVersion,
    "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
  )
}
