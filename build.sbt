/**
  * SBT is a complicated project that is highly configureable and 
  * Your project will probably end up with many more components than are illustrated here
  * Some resources:
  ** http://www.scala-sbt.org/documentation.html
  ** http://www.scala-sbt.org/0.13/docs/Resolvers.html
  */

// name your application, this will be used to for naming targets in the compilation
name := "scala-base-app"

scalaVersion := "2.11.7"

version := "0.1-SNAPSHOT"

/**
  * Add more libraries to this list as needed, comma separated.
  * Dependencies are formatted as follows:

      groupID % artifactID % revision % [OPTIONAL]configuration

  Tips:
   * scalaVersion dependent libraries can separate the first two strings with a double %%
     * More on that: http://www.scala-sbt.org/0.13/docs/Library-Dependencies.html#Getting+the+right+Scala+version+with
   * Java/Scala compatible libraries will separate the first two strings with a single %
   * Testing libraries can append "test" as the configuration as shown with 'scalatest'
     * These dependencies will "show up in the classpath only for the Test configuration and not the Compile configuration"
     * http://www.scala-sbt.org/0.13/docs/Library-Dependencies.html#Per-configuration+dependencies

  * You can usually find the format by searching http://mvnrepository.com/

  * These are just examples, you don't have to keep these.
  */
libraryDependencies ++= Seq(
  "joda-time"     %  "joda-time"    % "2.9.2",         // more robust Date and Time library than builtins
  "org.joda"      %  "joda-convert" % "1.2",           // http://stackoverflow.com/a/13856382/2981803
  "org.scalatest" %% "scalatest"    % "2.2.6" % "test" // one of the popular testing frameworks
)

