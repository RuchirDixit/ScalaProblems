package com.bridgelabz.functionalproblems

import com.bridgelabz.Utility.Utilities

/**
 * author - Admin
 * date - 02-11-2020
 * time - 22:47
 * package - com.bridgelabz.functionalproblems
 * title - Find roots of quadratic equation
 */
object Quadratic {
  // method to find 2 roots of quadratic equation
  def findRoots() = {
    try
      {
        val a = Utilities.getIntegerInput("Enter value of a:")
        val b = Utilities.getIntegerInput("Enter value of b:")
        val c = Utilities.getIntegerInput("Enter value of c:")
        val delta = b * b - 4 * a * c
        // to find first root of above equation
        val rootOne = (-b + Math.sqrt(Math.abs(delta))) / (2 * a)
        // to find second root of above equation
        val rootTwo = (-b - Math.sqrt(Math.abs(delta))) / (2 * a)
        println("Root 1 :" + rootOne)
        println("Root 2 :" + rootTwo)
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
}
