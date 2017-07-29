import org.scalatestplus.play._
import org.scalatestplus.play.guice.GuiceFakeApplicationFactory

class SeleniumSpec
  extends PlaySpec
  with BaseOneServerPerTest
  with OneBrowserPerTest
  with GuiceFakeApplicationFactory
  with HtmlUnitFactory {

  "SeleniumSpec" should {

    "work from within a browser" in {

      go to ("http://localhost:" + port)

      pageSource must include ("Your new application is ready.")
    }
  }
}
