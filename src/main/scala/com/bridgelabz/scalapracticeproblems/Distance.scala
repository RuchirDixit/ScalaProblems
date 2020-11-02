package com.bridgelabz.scalapracticeproblems

/**
 * author - Ruchir
 * date - 02-11-2020
 * time - 12:38
 * package - com.bridgelabz.scalapracticeproblems
 * title - Euclidean distance from the point (x, y) to the origin (0, 0)
 */
object Distance {

  // Method to accept X and Y and print Euclidean distance
  def printEuclideanDistance(): Unit =
  {
    println("Enter x:")
    val x = Utilities.getIntegerInput()
    println("Enter y:")
    val y = Utilities.getIntegerInput()
    val powerOfX = Math.pow(x,2)
    val powerOfY = Math.pow(y,2)
    val distance = Math.sqrt(powerOfX + powerOfY)
    println("Distance:" + distance)
  }

  // main method calls printEuclideanDistance method
  def main(args: Array[String]): Unit =
  {
    printEuclideanDistance()
  }
}
