package com.bridgelabz.Utility

/**
 * author - Ruchir
 * date - 31-10-2020
 * time - 20:16
 * package - com.bridgelabz.scalapracticeproblems
 * title - Provides methods to accept string and integer values
 */
object Utilities {
  def getIntegerInput(message : String) = {
    println(message)
    scala.io.StdIn.readInt()
  }
  def getStringInput(message : String) = {
    println(message)
    scala.io.StdIn.readLine()
  }
  def getFloatInput(message : String) = {
    println(message)
    scala.io.StdIn.readFloat()
  }
  def getBooleanInput(message : String) = {
    println(message)
    scala.io.StdIn.readBoolean()
  }
  def getTwoDIntegerArray(rows : Int , columns : Int, message : String)  = {
    val arrayName = Array.ofDim[Int](rows,columns)
    for (counter <- 0 until rows)
      {
        for (nestedCounter <- 0 until columns)
          {
              arrayName(counter)(nestedCounter) = getIntegerInput("")
          }
      }
    arrayName
  }
}
