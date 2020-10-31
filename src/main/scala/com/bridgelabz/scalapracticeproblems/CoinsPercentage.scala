package com.bridgelabz.scalapracticeproblems

/**
 * author - Admin
 * date - 30-10-2020
 * time - 23:34
 * package - com.bridgelabz.scalapracticeproblems
 * title - Flip coins and find percentage of heads and tails
 */
import scala.util.Random
// NumberFormatException
object CoinsPercentage {
  // Accepts number of flips from user and calculates percentage of heads and tails
  def main(args: Array[String]): Unit = {
    try
      {
        val numOfFlips = scala.io.StdIn.readInt()
        if(numOfFlips < 0)
        {
          println("Enter positive integer")
        }
        else{
          var heads = 0;
          var tails = 0;
          for ( i <- 0 until numOfFlips)
          {
            val randomNumber = Math.random()
            if(randomNumber < 0.5){
              tails += 1;
            }
            else{
              heads += 1;
            }
          }
          val headsPercentage = heads/numOfFlips.toDouble
          val tailsPercentage = tails/numOfFlips.toDouble
          println("Heads percent:" + headsPercentage * 100)
          println("Tails percent:" + tailsPercentage * 100)
        }
      }
    catch
      {
        case ex : NumberFormatException => {
          println("Number Format Exception")
        }
        case ex : ArithmeticException => {
          println("Arithmetic Exception")
        }
      }
  }
}
