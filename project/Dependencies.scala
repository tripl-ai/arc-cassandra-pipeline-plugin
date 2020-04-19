import sbt._

object Dependencies {
  // versions
  lazy val sparkVersion = "2.4.5"

  // testing
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.7" % "test,it"

  // arc
  val arc = "ai.tripl" %% "arc" % "2.10.0" % "provided"
  val typesafeConfig = "com.typesafe" % "config" % "1.3.1" intransitive()

  // spark
  val sparkSql = "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
  val sparkHive = "org.apache.spark" %% "spark-hive" % sparkVersion % "provided"

  // cassandra
  val cassandra = "com.datastax.spark" %% "spark-cassandra-connector" % "2.4.3" intransitive()
  val jsr166e = "com.twitter" % "jsr166e" % "1.1.0" % "provided"

  // Project
  val etlDeps = Seq(
    scalaTest,

    arc,
    typesafeConfig,

    sparkSql,
    sparkHive,

    cassandra,
    jsr166e
  )
}
