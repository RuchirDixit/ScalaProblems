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
  def main(args: Array[String]): Unit = {
    val numOfFlips = scala.io.StdIn.readInt()
    if(numOfFlips < 0){
      println("Enter positive integer")
    }
    else{
      var heads = 0;
      var tails = 0;
      for ( i <- 0 until numOfFlips)
      {
        val randomNumber = Math.random()
        println(randomNumber)
        if(randomNumber < 0.5){
          tails += 1;
        }
        else{
          heads += 1;
        }
      }
      println(heads)
      println(tails)
      val headsPercentage = heads/numOfFlips.toDouble
      val tailsPercentage = tails/numOfFlips.toDouble
      println("Heads percent:" + headsPercentage * 100)
      println("Tails percent:" + tailsPercentage * 100)
    }
  }
}
