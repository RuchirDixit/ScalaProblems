package com.bridgelabz.basiccoreproblems

/**
 * author - Ruchir
 * date - 01-11-2020
 * time - 13:17
 * package - com.bridgelabz.basiccoreproblems
 * title - Print prime factors of number N
 */
import com.bridgelabz.Utility.Utilities

import scala.util.control.Breaks._
object PrimeFactors {

  val Two = 2
  // accepts number and prints its prime factors
  def printPrimeFactors() = {
    try {
      var isPrime = false
      var range = Utilities.getIntegerInput("Enter number to find factors:")
      while (range % Two == 0) {
        println(Two + " ");
        range /= Two;
      }
      var counter = 3
      while ( {
        counter <= Math.sqrt(range)
      }) { // While counter divides range, print counter and divide range
        while ( {
          range % counter == 0
        }) {
          println(counter + " ")
          range /= counter
        }
        counter += Two
      }
      if (range > Two)
        println(range);
    }
    catch
      {
        case _ : ArithmeticException =>
        {
          println("Error, Cannot divide by zero")
        }
        case _ : NumberFormatException =>
        {
          println("Error, Expected value is Integer")
        }
      }
  }
  // main method calls printPrimeFactors method
  def main(args: Array[String]): Unit = {
    printPrimeFactors()
  }
}