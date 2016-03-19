package tld.domain.scala_base_app

import org.joda.time.DateTime
import org.scalatest.{FunSpec, Matchers}

class Spec extends FunSpec with Matchers {

  describe("NameTheMonth#getMonth") {
    it("should return the full string formatted month name for an input date") {
      NameTheMonth.getMonth(new DateTime("2016-02-01")) shouldBe "February"
      NameTheMonth.getMonth(new DateTime("2016-10-01")) shouldBe "October"
      NameTheMonth.getMonth(new DateTime("2016-6-24")) shouldBe "June"
    }
  }
}