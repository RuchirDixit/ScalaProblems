package com.bridgelabz.basiccoreproblems

import com.bridgelabz.Utility.Utilities

/**
 * author - Ruchir
 * date - 30-10-2020
 * time - 23:34
 * package - com.bridgelabz.basiccoreproblems
 * title - Flip coins and find percentage of heads and tails
 */

object CoinsPercentage {
  val ConditionHeadsAndTails = 0.5
  // Accepts number of flips from user and calculates percentage of heads and tails
  def calculatePercentage() = {
    try
      {
        val numOfFlips = Utilities.getIntegerInput("Enter number of flips:")
        if(numOfFlips < 0)
        {
          println("Enter positive integer")
        }
        else {
          var tails = 0;
          // looping through N number of flips to check count of tails
          for ( _ <- 0 until numOfFlips)
          {
            // Choosing random value between 0 to 1
            val randomNumber = Math.random()
            if(randomNumber < ConditionHeadsAndTails){
              tails += 1;
            }
          }
          val heads = numOfFlips - tails
          // Calculating heads and tails percentage
          val headsPercentage = heads/numOfFlips.toDouble
          val tailsPercentage = tails/numOfFlips.toDouble
          println("Heads percent:" + headsPercentage * 100)
          println("Tails percent:" + tailsPercentage * 100)
        }
      }
    catch
      {
        case _ : NumberFormatException => {
          println("Error,Incorrect Type of input, Expected value is Integer")
        }
        case _ : ArithmeticException => {
          println("Error,Integer divided by 0")
        }
        case _ : Exception => {
          println("Error, Unhandled exception occurred")
        }
      }
  }
  // main method calls calculatePercentage() method
  def main(args: Array[String]): Unit = {
   calculatePercentage()
  }
}
