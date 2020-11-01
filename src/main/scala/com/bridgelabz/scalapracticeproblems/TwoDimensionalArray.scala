package com.bridgelabz.scalapracticeproblems

/**
 * author - Admin
 * date - 01-11-2020
 * time - 23:35
 * package - com.bridgelabz.scalapracticeproblems
 * title - Accept 2D array from user and print it
 */
object TwoDimensionalArray {
  // accepts value of array from user
  def acceptArrayFromUser(rows : Int, columns : Int) = {
    println("Enter values:")
    var arr = Utilities.getTwoDIntegerArray(rows,columns)
    arr
  }
  // prints the array to screen
  def printArray(rows : Int, columns : Int, array: Array[Array[Int]]): Unit =
  {
    println("Array is: ")
    for (counter <- 0 until rows)
    {
      for (nestedCounter <- 0 until columns)
      {
        println(array(counter)(nestedCounter) + " ")
      }
    }
  }
  // accepts number of rows and columns and passes it to acceptArray and printArray methods
  def main(args: Array[String]): Unit = {
    println("Enter number of rows:")
    val rows = Utilities.getIntegerInput()
    println("Enter number of columns:")
    val columns = Utilities.getIntegerInput()
    var arr = Array.ofDim[Int](rows,columns)
    arr = acceptArrayFromUser(rows,columns)
    printArray(rows,columns,arr)
  }
}
