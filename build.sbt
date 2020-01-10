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
    resolvers += "orgscala-lang-2039" at
      "https://oss.sonatype.org/content/repositories/orgscala-lang-2039/",
    resolvers += "orgscala-lang-2041" at
      "https://oss.sonatype.org/content/repositories/orgscala-lang-2041/",
    libraryDependencies +=
      "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1"
  )
