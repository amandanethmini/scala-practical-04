object practical4_3 {

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val n1 = "Benny"
    val n2 = "Niroshan"
    val n3 = "Saman"
    val n4 = "Kumara"

    println(formatNames(n1)(toUpper))
    println(
      formatNames(n2)(name =>
        name.substring(0, 2).toUpperCase + name.substring(2)
      )
    ) // Output: NIroshan
    println(formatNames(n3)(toLower))
    println(
      formatNames(n4)(name =>
        name.substring(0, 1).toUpperCase + name
          .substring(1, 5)
          .toLowerCase + name.substring(5).toUpperCase
      )
    ) // Output: KumarA
  }
}
