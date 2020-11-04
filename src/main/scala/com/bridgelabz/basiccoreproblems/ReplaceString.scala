package com.bridgelabz.basiccoreproblems

/**
 * author - Ruchir
 * date - 30/10/20
 * time - 11:00 PM
 * package - com.bridgelabz.basiccoreproblems
 * title - Program to Replace String
 */

import java.io.IOException

import com.bridgelabz.Utility.Utilities

import scala.util.matching.Regex
object ReplaceString {

  // It accepts username from user and if it matches the expression then prints "Hello <<username>>, How are you?"
  def replaceString() = {
    try
      {
        val pattern = new Regex("^[a-zA-Z]{3,}$")
        val userName = Utilities.getStringInput("Enter username:")
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
        case _ : Exception => {
          println("Error, Unhandled exception occurred")
        }
      }
  }

  // main method calls replaceString method
  def main(args: Array[String]): Unit = {
    replaceString()
  }

}
