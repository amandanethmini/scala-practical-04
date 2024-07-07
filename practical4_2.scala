object practical4_2 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      try {
        val input = args(0).toInt
        val result = input match {
          case x if x <= 0     => "Nagative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case _               => "Odd number is given"
        }
        println(result)
      } catch {
        case e: NumberFormatException => println("Please enter a valid integer")
      }
    } else {
      println("Please provide an integer input")
    }
  }
}
