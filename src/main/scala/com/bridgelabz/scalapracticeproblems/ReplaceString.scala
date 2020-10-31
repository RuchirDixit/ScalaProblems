package com.bridgelabz.scalapracticeproblems

/**
 * author - Ruchir
 * date - 30/10/20
 * time - 11:00 PM
 * package - com.bridgelabz.scalapracticeproblems
 * title - Program to Replace String
 */

import java.io.IOException
import scala.util.matching.Regex
object ReplaceString {

  // It accepts username from user and if it matches the expression then prints "Hello <<username>>, How are you?"
  def main(args: Array[String]): Unit = {
    // Handling Input Output Exception
    try
      {
      val pattern = new Regex("^[a-zA-Z]{3,}$")
      println("Enter username:")
      val userName = Utilities.getStringInput()
        // If pattern matches username when print String with username else print Does not match
      if (pattern.matches(userName))
        println("Hello " + userName + ", How are you?")
      else
        println("Does not match!")
      }
    catch
      {
        case _: NumberFormatException => {
          println("Incorrect format of Input, expected value is String")
        }
      }
  }
}
