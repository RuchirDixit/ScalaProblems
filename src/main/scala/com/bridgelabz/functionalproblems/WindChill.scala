package com.bridgelabz.functionalproblems
import com.bridgelabz.Utility.Utilities
/**
 * author - Ruchir
 * date - 02-11-2020
 * time - 23:44
 * package - com.bridgelabz.functionalproblems
 * title - Print wind chill with given temperature and velocity
 */
object WindChill {
  def printWindChill() = {
    try {
      val temperature = Utilities.getDoubleInput("Enter temperature (In Fahrenheit):")
      val velocity = Utilities.getDoubleInput("Enter wind speed :")
      if (temperature > 50.0 || velocity > 120 || velocity < 3)
      {
        println("Invalid input!")
      }
      val windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity,0.16)
      println("Wind Chill : " + windChill)
    }
    catch {
      case _ : NumberFormatException => {
        println("Incorrect input, Expected value is integer")
      }
      case _ : ArithmeticException => {
        println("Error, Divide by zero")
      }
    }
  }
}
