package com.bridgelabz.functionalproblems

import com.bridgelabz.Utility.Utilities

/**
 * author - Ruchir
 * date - 02-11-2020
 * time - 11:54
 * package - com.bridgelabz.functionalproblems
 * title - To find count and display Sum of 3 integers adds to zero
 */
object SumOfThreeInt {

  // finds 3 integers with sum equals to zero
  def printSumAndCount() = {
    try {
      val number = Utilities.getIntegerInput("Enter number of integers in Array:")
      var intArray = new Array[Int](number)
      println("Enter values of array:")
      var count = 0
      // accepts value of array from user
      for( counter <- 0 until number)
      {
        intArray(counter) = Utilities.getIntegerInput("")
      }

      // loops through the array to find sum of 3 integers equals to 0
      for ( counter <- 0 until number-2 )
      {
        for ( nestedCounter <- counter+1 until number-1 )
        {
          for ( insideCounter <- nestedCounter+1 until number )
          {
            if ( (intArray(counter) + intArray(nestedCounter) + intArray(insideCounter)) == 0)
            {
              count += 1
              println(intArray(counter) + " " + intArray(nestedCounter) + " " + intArray(insideCounter))
            }
          }
        }
      }
      println("Count : " + count)
    }
    catch {
      case _ : NumberFormatException => {
        println("Incorrect input, Expected value is integer")
      }
      case _ : ArithmeticException => {
        println("Error, Divide by zero")
      }
      case _ : Exception => {
        println("Error, Unhandled exception occurred")
      }
    }

  }
  // calls printSumAndCount method
  def main(args: Array[String]): Unit = {
    printSumAndCount()
  }
}
