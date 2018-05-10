package com.scb.test

class Solution3(val name: String, val id:Long) {
  override def equals(that:Any):Boolean={
    that match {
      case book:Solution3 => book.name ==this.name
      case _ => false
      
    }
  }
  
  override def hashCode():Int = name.hashCode()

}

