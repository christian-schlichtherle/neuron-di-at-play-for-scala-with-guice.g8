lazy val root = (project in file(".")).enablePlugins(PlayScala, NeuronDIAtGuiceForScalaPlugin)

name := "$name$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "$scalatestplus_play_version$" % Test
)
