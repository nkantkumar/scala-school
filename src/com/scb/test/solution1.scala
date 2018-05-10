package com.scb.test

object solution1 extends App {
  val a = List(1, 2, 3)
  val l = 1 :: 2 :: 3 :: Nil
  println(l)

  println(l.iterator.next())
  val l2 = -2 :: -1 :: Nil
  println(l2 ::: l)

  val l3 = 1 :: ::(2, Nil) ::: ::(3, Nil) ::: Nil

  println(l3)

  import scala.util.Random.nextInt
  val s = List.fill(100)(nextInt(100))
  println(isSorted(s))
  println(isSorted(sort(s)))

  def sort(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case pivot :: tail => {
        val (less, greater) = tail.partition(_ < pivot)
        sort(less) ::: pivot :: sort(greater)
      }
    }
  }

  def isSorted(l: List[Int]) = l.isEmpty || l.view.zip(l.tail).forall(x => x._1 <= x._2)

  sealed trait Maybe[+T]
  case class Value[T](value: T) extends Maybe[T]
  case object NoValue extends Maybe[Nothing]

  val v: Maybe[Int] = Value(42)
  val v_1: Maybe[Int] = NoValue

  def logValue[T](value: Maybe[T]): Unit = value match {
    case Value(v) => println(s"We have a value here: $v")
    case NoValue => println("I'm sorry, no value")
  }

  // prints We have a value here: 42
  logValue(v)
  // prints I'm sorry, no value
  logValue(v_1)
  
  
  def toInt(in: String): Option[Int] = {
    try {
        Some(Integer.parseInt(in.trim))
    } catch {
        case e: NumberFormatException => None
    }
}

}