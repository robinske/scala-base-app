package tld.domain.scala_base_app

import org.joda.time.DateTime

object NameTheMonth {

  def getMonth(d: DateTime): String = d.toString("MMMM")

  def main(args: Array[String]): Unit = {
    val currentTime = DateTime.now()
    val currentMonth = getMonth(currentTime)
    println(s"It's $currentMonth")
  }
}
