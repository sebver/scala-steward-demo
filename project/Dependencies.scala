import sbt._

object Dependencies {

  val scalaTestVersion = "3.2.15"

  val scalaTest = Seq(
    "org.scalactic" %% "scalactic" % scalaTestVersion,
    "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
  )
}
