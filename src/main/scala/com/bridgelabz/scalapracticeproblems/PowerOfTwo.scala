package com.bridgelabz.scalapracticeproblems

/**
 * author - Ruchir
 * date - 31-10-2020
 * time - 13:01
 * package - com.bridgelabz.scalapracticeproblems
 * title - Print table of power of 2 till N
 */
object PowerOfTwo {
  val LowerLimit = 0
  val UpperLimit = 31
  // Accepts value N from user and prints the table of 2 till 2^N is reached
  def calculatePowerOfTwo() = {
    try
      {
        val value = Utilities.getIntegerInput()
        if ( value >= LowerLimit && value < UpperLimit)
        {
          var counter = 0
          while (scala.math.pow(2,counter) < scala.math.pow(2,value))
          {
            println("2 ^ " + counter + " = " + scala.math.pow(2,counter))
            counter += 1
          }
        }
        else
        {
          println("Invalid input!")
        }
      }
    catch
      {
        case _ : ArithmeticException =>
        {
          println("Error, Cannot Divide By Zero")
        }
      }
  }
  // main method to call calculatePowerOfTwo method
  def main(args: Array[String]): Unit = {
    calculatePowerOfTwo()
  }
}
