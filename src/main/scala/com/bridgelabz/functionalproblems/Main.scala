package com.bridgelabz.functionalproblems
import com.bridgelabz.Utility.Utilities
/**
 * author - Ruchir
 * date - 02-11-2020
 * time - 23:30
 * package - com.bridgelabz.functionalproblems
 */
object Main {
  def main(args: Array[String]): Unit = {
    val choice = Utilities.getIntegerInput("Enter choice: \n 1: Quadratic \n 2: Wind Chill")
    choice match {
      case 1 => {
        Quadratic.findRoots()
      }
      case 2 => {
        WindChill.printWindChill()
      }
    }
  }
}
