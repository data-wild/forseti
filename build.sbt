ThisBuild / organization := "com.tulu"
ThisBuild / scalaVersion := "3.2.1"
ThisBuild / version      := "0.0.1-dev"

lazy val root = (project in file("."))
  .settings(
    name := "forseti"
  )