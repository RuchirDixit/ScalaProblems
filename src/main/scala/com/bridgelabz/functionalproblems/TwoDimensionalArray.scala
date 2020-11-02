package com.bridgelabz.functionalproblems

import com.bridgelabz.Utility.Utilities

/**
 * author - Admin
 * date - 01-11-2020
 * time - 23:35
 * package - com.bridgelabz.functionalproblems
 * title - Accept 2D array from user and print it
 */
object TwoDimensionalArray {
  // accepts value of array from user
  def acceptArrayFromUser(rows : Int, columns : Int) = {
    var arr = Utilities.getTwoDIntegerArray(rows,columns,"Enter values:")
    arr
  }
  // prints the array to screen
  def printArray(rows : Int, columns : Int, array: Array[Array[Int]]): Unit =
  {
    try {
      println("Array is: ")
      for (counter <- 0 until rows)
      {
        for (nestedCounter <- 0 until columns)
        {
          println(array(counter)(nestedCounter) + " ")
        }
      }
    }
    catch {
      case _ : ArrayIndexOutOfBoundsException => {
        println("Size of array exceeded!")
      }
    }
  }
  // accepts number of rows and columns and passes it to acceptArray and printArray methods
  def main(args: Array[String]): Unit = {
    val rows = Utilities.getIntegerInput("Enter number of rows:")
    val columns = Utilities.getIntegerInput("Enter number of columns:")
    var arr = Array.ofDim[Int](rows,columns)
    arr = acceptArrayFromUser(rows,columns)
    printArray(rows,columns,arr)
  }
}
