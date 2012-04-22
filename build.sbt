import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "fridge"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies += "com.twitter" % "finagle-core" % "1.9.10"

libraryDependencies += "com.twitter" % "finagle-http" % "1.9.10"

libraryDependencies += "net.databinder" %% "unfiltered-netty" % "0.6.1" withSources()

libraryDependencies += "net.databinder" %% "unfiltered-netty-server" % "0.6.1" withSources()

libraryDependencies += "net.databinder" %% "unfiltered-filter" % "0.6.1" withSources()

mainClass := Some("com.dz.fridge.bootstrap.UnfilteredMain")
