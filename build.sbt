ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "gr.uoc.cs562"
ThisBuild / version      := "0.1.0-SNAPSHOT"

// Common options
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings"
)

lazy val root = (project in file("."))
  .settings(
    name := "scala-vscode-starter",
    libraryDependencies ++= Seq(
      // Testing
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
      // Add Spark if needed
      // , "org.apache.spark" %% "spark-core" % "3.5.1" % "provided"
      // , "org.apache.spark" %% "spark-sql"  % "3.5.1" % "provided"
    )
  )

// For Spark 2.2.x (very old), set scalaVersion to 2.11.12 and change deps accordingly.
