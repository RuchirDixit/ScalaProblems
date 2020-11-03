package com.bridgelabz.logicalproblems
import com.bridgelabz.Utility.Utilities
/**
 * author - Admin
 * date - 03-11-2020
 * time - 11:48
 * package - com.bridgelabz.logicalproblems
 * title - Main class to print menu and run particular program
 */
object Main {
  // main method to display menu to run any program selected by user
  def main(args: Array[String]): Unit = {
    val choice = Utilities.getIntegerInput("Enter choice: \n 1: Gambler")
    choice match {
      case 1 => {
        Gambler.printWinLossPercent()
      }
    }
  }
}
