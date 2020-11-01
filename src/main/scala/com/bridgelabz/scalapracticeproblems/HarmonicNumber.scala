package com.bridgelabz.scalapracticeproblems

/**
 * author - Ruchir
 * date - 01-11-2020
 * time - 12:33
 * package - com.bridgelabz.scalapracticeproblems
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
        println("Enter number to find harmonic value:")
        val number = Utilities.getIntegerInput()
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
      }

  }

  // main method calls printHarmonicNumber method
  def main(args: Array[String]): Unit = {
    printHarmonicNumber()
  }
}
