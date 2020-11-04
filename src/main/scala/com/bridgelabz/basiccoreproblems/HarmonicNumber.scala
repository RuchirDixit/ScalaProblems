package com.bridgelabz.basiccoreproblems

import com.bridgelabz.Utility.Utilities
import com.bridgelabz.Utility.Utilities.getIntegerInput

/**
 * author - Ruchir
 * date - 01-11-2020
 * time - 12:33
 * package - com.bridgelabz.basiccoreproblems
 * title - Print Nth harmonic value
 */
object HarmonicNumber {

  val One = 1
  val Start = 2
  val RoundOffValue = 100
  // accepts integer value from user and prints harmonic value at that number
  def printHarmonicNumber() = {
    try
      {
        var harmonicNumber = 1.0;
        val number = Utilities.getIntegerInput("Enter number to find harmonic value:")
        if (number == 0)
            println("N cannot be 0")
        // looping till Nth value to add previous harmonic number to new number
        for ( counter <- Start to number)
          {
            var value = One/counter.toDouble
            harmonicNumber += value
          }
        println("Number: " + (harmonicNumber * RoundOffValue).round / RoundOffValue.toDouble)
      }
    catch
      {
        case _ : NumberFormatException => {
          println("Error, Incorrect Input. Expected value is Int.")
        }
        case _ : Exception => {
          println("Error, Unhandled exception occurred")
        }
      }

  }

  // main method calls printHarmonicNumber method
  def main(args: Array[String]): Unit = {
    printHarmonicNumber()
  }
}
