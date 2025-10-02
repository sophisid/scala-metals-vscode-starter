# Scala + VS Code Project Management (Metals + sbt)

This is a ready-to-use scaffold for managing Scala projects in VS Code using Metals and sbt.

## What you get
- sbt build with Scala 2.12.18
- VS Code tasks for compile, run, test, format, and scalafix
- Metals-compatible launch configs
- scalafmt and scalafix configured
- ScalaTest for unit tests

## Quick start
1) Install JDK 11+, sbt, and the Metals extension in VS Code.
2) Open this folder in VS Code.
3) When Metals prompts "Import build", accept.
4) Press `Ctrl+Shift+B` and pick **sbt: compile (watch)** to auto-compile.
5) Use **Terminal → Run Task** for test/run/format.

## Spark (optional)
If you need Spark, add the Spark dependencies in `build.sbt`. For older Spark 2.2.x, change the Scala version to 2.11.12 and adjust deps.

## Multi-module (optional)
Create additional subprojects under `modules/` and aggregate them in `build.sbt`:
```scala
lazy val core = project in file("modules/core")
lazy val app  = (project in file("modules/app")).dependsOn(core)
lazy val root = (project in file(".")).aggregate(core, app)
```
