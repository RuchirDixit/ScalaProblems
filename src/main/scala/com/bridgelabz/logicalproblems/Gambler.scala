package com.bridgelabz.logicalproblems
import com.bridgelabz.Utility.Utilities
/**
 * author - Ruchir
 * date - 03-11-2020
 * time - 11:47
 * package - com.bridgelabz.logicalproblems
 * title - Program to print number of wins and percentage of win or loss
 */
object Gambler {

  val NumberOfOutcomes = 2
  // method to calculate percentage of Wins and Losses
  def calPercentage(wins: Int, chances : Int) = {
    try {
        val loss = chances - wins
        val winPercent = wins/chances.toDouble
        val lossPercent = loss/chances.toDouble
        println("Win Percent: " + winPercent * 100 + "Loss Percent: " + lossPercent * 100)
      }
    catch {
      case _ : ArithmeticException => {
        println("Error, Cannot divide by zero")
      }
    }
  }

  // method to accept stake,goal and number of chances from user to check whether player wins or losses the chance to reach the goal
  def printWinLossPercent() = {
    try
      {
        var stake = Utilities.getIntegerInput("Enter stake amount:")
        val goal = Utilities.getIntegerInput("Enter goal amount:")
        val numberOfChances = Utilities.getIntegerInput("Enter max number of chances to play:")
        var wins = 0
        var count = 0
        // looping will player goes broke or does not reach goal or does not reach max number of chances
        while ( stake <= goal && stake != goal && count != numberOfChances)
        {
          val bettingDraw = Math.floor(Math.random * 10).toInt % NumberOfOutcomes
          count += 1
          if (bettingDraw == 1)
          {
            wins += 1
            stake += 1
          }
          else
          {
            stake -= 1
          }
        }
        println("Total wins : " + wins)
        calPercentage(wins,numberOfChances)
    }
    catch {
      case _ : NumberFormatException => {
        println("Error, Incorrect input given. Expected input is number.")
      }
      case _ : ArithmeticException => {
        println("Error, Cannot divide by zero")
      }
    }
  }
}
