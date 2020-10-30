package com.bridgelabz.scalapracticeproblems

/**
 * author - Admin
 * date - 30/10/20
 * time - 11:00 PM
 * package - com.bridgelabz.scalapracticeproblems
 * title - Program to Replace String
 */

import scala.util.matching.Regex
object ReplaceString {

  // It accepts username from user and if it matches the expression then prints "Hello <<username>>, How are you?"
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("^[a-zA-Z]{3,}$")
      println("Enter username:")
      val userName = scala.io.StdIn.readLine()
      if (pattern.matches(userName))
      println("Hello " + userName + ", How are you?")
      else
        println("Does not match!")
  }
}
