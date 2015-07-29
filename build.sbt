organization := "megri"
name := "spray-upickle-json-support"
description := "Provides JSON marshalling for Spray using UPickle"

crossScalaVersions := Seq("2.10.5", "2.11.7")
releaseCrossBuild := true

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayPackageLabels := Seq("spray", "upickle", "json")

libraryDependencies ++= Seq(
  "io.spray" %% "spray-httpx" % "1.3.+" % "provided",
  "com.lihaoyi" %% "upickle" % "0.3.+" % "provided"
)

