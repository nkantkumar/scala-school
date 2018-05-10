package com.scb.test

object OptionTest extends App {

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }

  val bag = List("1", "2", "foo", "3", "bar")
  val sum = bag.flatMap(toInt).sum
  
 // print(sum)
  
  for { 
    i <- 1 to 3 
    from = 4 - i
    j <- from to 3 
    k= i*j
    
    
  }yield k
  
  for(i <- 10 to 1 by -1) print(i)

}