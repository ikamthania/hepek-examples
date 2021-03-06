package examples.bootstrap

import scalatags.Text.all._
import ba.sake.hepek.bootstrap3.statik.BootstrapStaticPage

object SimpleBootstrapPage extends BootstrapStaticPage {

  override def pageSettings =
    super.pageSettings
      .withTitle("awww-some title")

  // override def bootstrapContainer = "container"

  // override def bootstrapNavbar  =  Some(Position.FixedBottom, Style.Inverse)

  override def pageContent = div(
    div(cls := "page-header")(
      h1("Example Page Header")
    ),
    div(cls := "jumbotron")(
      h2("Hello world!"),
      p("Some content...")
    )
  )

}
