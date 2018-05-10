package com.scb.test

import java.nio.file.FileAlreadyExistsException
import scala.util.control.Breaks._
class Variance extends App {

  def failingFn(i: Int): Int = {
    val y: Int = throw new Exception("fail!")
    try {
      val x = 42 + 5
      x + y
    } catch { case e: FileAlreadyExistsException => 2 }
  }

  var sum = 0
  for (ch <- "Hello") {

    if (sum > 100) break
    else {
      sum += ch
    }
  }
  print(sum)
}




