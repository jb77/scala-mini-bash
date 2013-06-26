object FunWithXml extends App {

  val employeeXml = scala.xml.XML.loadFile("src/main/scala/features/employee.xml")

  val employees = employeeXml \ "employee"

  val idList = (employeeXml \\ "@id").mkString(", ")
  println(s"Data for employees $idList")

  employees.foreach(employee => {
    val fname = (employee \ "name" \ "firstname").text
    val sname = (employee \ "name" \ "secondname").text
    val salary = (employee \ "salary").text
    println(s"$fname $sname earns $salary")
  })

  val newEmployee = 
  <employee id="789">
    <name>
    <firstname>John</firstname>
    <secondname>Smith</secondname>
    </name>
  </employee>

  val updatedXml = <employees>{employees :+ newEmployee}</employees>
  scala.xml.XML.save("updated.xml", updatedXml)
}