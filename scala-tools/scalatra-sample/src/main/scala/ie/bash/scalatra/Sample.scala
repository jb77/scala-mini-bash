package ie.bash.scalatra

import org.scalatra._
import scalate.ScalateSupport

class Sample extends ScalatraServlet {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
      </body>
    </html>
  }

}
