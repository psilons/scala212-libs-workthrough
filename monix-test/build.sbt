organization := "org.mytest.monix.test"

name := "monix-test"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.15"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.6"

libraryDependencies += "io.monix" %% "monix" % "3.4.0"
