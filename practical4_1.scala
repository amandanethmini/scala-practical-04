object practical4_1 {
  var itemName: Array[String] = Array("Apple", "Banana", "Orange", "Mango")
  var itemQuantity: Array[Int] = Array(10, 20, 30, 40)

  def display(): Unit = {
    println("Inventory:")
    for (i <- itemName.indices) {
      println(s"${itemName(i)}:${itemQuantity(i)}")
    }
  }

  def restock(item: String, quantity: Int): Unit = {
    val index = itemName.indexOf(item)
    if (index != -1) {
      itemQuantity(index) = itemQuantity(index) + quantity
      println(
        s"Restocked $quantity of $item. New quantity: ${itemQuantity(index)}"
      )
    } else {
      println(s"Item '$item' does not exist in the inventory.")
    }
  }

  def sell(item: String, quantity: Int): Unit = {
    val index = itemName.indexOf(item)
    if (index != -1) {
      if (itemQuantity(index) >= quantity) {
        itemQuantity(index) = itemQuantity(index) - quantity
        println(
          s"Sold $quantity of $item. Remaining quantity: ${itemQuantity(index)}"
        )
      } else {
        println(
          s"Not enough quantity of '$item' to sell. Available quantity: ${itemQuantity(index)}"
        )
      }
    } else {
      println(s"Item '$item' does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    display()
    restock("Apple", 4)
    restock("Grapes", 4)
    sell("Banana", 10)
    sell("Apple", 30)
    display()

  }
}
