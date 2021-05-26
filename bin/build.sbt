lazy val root = (project in file("."))
  .settings(
    name := "spring-boot-scala-web",

    version := "1.0",

    scalaVersion := "2.10.4",

    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
      "org.springframework.boot" % "spring-boot-starter-data-redis" % "2.4.2",
      "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.4.2",
      "redis.clients" % "jedis" % "3.2.0"
     ),

    mainClass := Some("example.MyApp")
)
