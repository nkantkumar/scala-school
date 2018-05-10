package com.scb.test

class MyObject(override protected val initialName: String = "") extends MyTrait {

  private var myName: String = initialName

  def name_=(newName: String) {
    myName = newName
  }
  override def name = myName
}

trait MyTrait {
  protected val initialName: String = "default"
  def name = initialName
}
object Test extends App {
  val myObject = new MyObject("abc")
  println(myObject.name)
  myObject.name = "def"
  println(myObject.name)
}
