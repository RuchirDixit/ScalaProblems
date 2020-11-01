package com.bridgelabz.scalapracticeproblems

/**
 * author - Ruchir
 * date - 31-10-2020
 * time - 20:16
 * package - com.bridgelabz.scalapracticeproblems
 * title - Provides methods to accept string and integer values
 */
object Utilities {
  def getIntegerInput() = {
    scala.io.StdIn.readInt()
  }
  def getStringInput() = {
    scala.io.StdIn.readLine()
  }
  def getFloatInput() = {
    scala.io.StdIn.readFloat()
  }
  def getBooleanInput() = {
    scala.io.StdIn.readBoolean()
  }
  def getTwoDIntegerArray(rows : Int , columns : Int)  = {
    val arrayName = Array.ofDim[Int](rows,columns)
    for (counter <- 0 until rows)
      {
        for (nestedCounter <- 0 until columns)
          {
              arrayName(counter)(nestedCounter) = getIntegerInput()
          }
      }
    arrayName
  }
}
