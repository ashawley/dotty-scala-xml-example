lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-scala-xml-example",
    description := "Example that uses scala-xml from Dotty",
    version := "0.1.0",
    scalaVersion := "0.21.0-RC1",
    crossScalaVersions := Seq(
      "0.21.0-RC1",
      "0.20.0-RC1"
    ),
    libraryDependencies +=
      "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1"
  )
