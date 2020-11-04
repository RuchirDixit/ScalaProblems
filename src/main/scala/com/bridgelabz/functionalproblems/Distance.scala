package com.bridgelabz.functionalproblems

import com.bridgelabz.Utility.Utilities

/**
 * author - Ruchir
 * date - 02-11-2020
 * time - 12:38
 * package - com.bridgelabz.functionalproblems
 * title - Euclidean distance from the point (x, y) to the origin (0, 0)
 */
object Distance {

  val Power = 2
  // Method to accept X and Y and print Euclidean distance
  def printEuclideanDistance(): Unit =
  {
    try
      {
        val x = Utilities.getIntegerInput("Enter x:")
        val y = Utilities.getIntegerInput("Enter y:")
        val powerOfX = Math.pow(x,Power)
        val powerOfY = Math.pow(y,Power)
        val distance = Math.sqrt(powerOfX + powerOfY)
        println("Distance:" + distance)
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

  // main method calls printEuclideanDistance method
  def main(args: Array[String]): Unit =
  {
    printEuclideanDistance()
  }
}