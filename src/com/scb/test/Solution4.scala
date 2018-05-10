package com.scb.test

import scala.concurrent.future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
object Solution4 extends App{
  
 
  val map = Map(1->"onw",2->"two")
  print(map(1))
  map.isDefinedAt(1)
 
  
}


 trait BaseSoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
}
 
 