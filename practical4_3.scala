object practical4_3 {
  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    names.foreach { name =>
      val formattedName = formatNames(name) {
        case s if s == s.toUpperCase => toLower(s)
        case _                       => toUpper(name)
      }
      println(formattedName)
    }
  }
}
