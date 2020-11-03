package com.bridgelabz.logicalproblems
import com.bridgelabz.Utility.Utilities
/**
 * author - Ruchir
 * date - 03-11-2020
 * time - 11:48
 * package - com.bridgelabz.logicalproblems
 * title - Main class to print menu and run particular program
 */
object Main {
  // main method to display menu to run any program selected by user
  def main(args: Array[String]): Unit = {
    val choice = Utilities.getIntegerInput("Enter choice: \n 1: Gambler \n 2: Coupon \n 3: Stop Watch \n 4: Tic Tac Toe")
    choice match {
      // case 1 for Gambling problem
      case 1 => {
        Gambler.printWinLossPercent()
      }
      // case 2 for Coupon problem
      case 2 => {
        val TotalCoupons = Utilities.getIntegerInput("Please Enter how many coupons to generate: ")
        Coupon.generateCoupons(TotalCoupons)
      }
      // case 3 for Stopwatch problem
      case 3 => {
        val start = Utilities.getStringInput("Enter s to start:")
        if (start == "s") StopWatch.start()
        val end = Utilities.getStringInput("Enter e to end:")
        if (end == "e") StopWatch.stop()
      }
      case 4 => {
        TicTacToe.main()
      }
    }
  }
}
