package com.scb.test

case class Topping (name: String, price: Float)

object Topping {
  def apply(name: String): Option[Topping] = name match {
    case "Onion" => Some(Topping(name, 1))
    case "Peppers" => Some(Topping(name, 1.5f))
    case "Ham" => Some(Topping(name, 2.5f))
    case "Pepperoni" => Some(Topping(name, 2))
    case "Olives" => Some(Topping(name, 1))
    case _ => None
  }
}


case class Pizza (toppings: List[Topping]){
	
  def addTopping(topping: Option[Topping]): Pizza = {
    if (topping.isEmpty) this
    else Pizza(toppings :+ topping.get)
  }
}

object Pizza {
  val BasePrice: Float = 3.5f
}


case class Order(pizzas: List[Pizza]) {
  
  val minimumOrderValue = 12.50
  
  def isValidOrder(): Boolean = {
    price() > minimumOrderValue
  }
  
  def price(): Float = {
    val toppingPrices = for {
      pizza <- pizzas
      topping <- pizza.toppings
    } yield topping.price
    toppingPrices.foldLeft(Pizza.BasePrice* pizzas.length)(_ + _)
  }
 
}