package com.scb.test

class Solution2 {
  abstract class CommonObjectInfo{
    
  }

class ConcreteObject extends CommonObjectInfo

abstract class AbstractWrapper{
 type objectInfo <: CommonObjectInfo
}

class ConcreteWrapper {
  type objectInfo = ConcreteObject 
}
}