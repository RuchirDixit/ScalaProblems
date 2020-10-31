package com.bridgelabz.scalapracticeproblems


/**
 * author - Admin
 * date - 31-10-2020
 * time - 12:09
 * package - com.bridgelabz.scalapracticeproblems
 * title - program to accept year from user and print if leap year or not
 */
import java.io.IOException
import scala.util.matching.Regex
object LeapYear {
  def main(args: Array[String]): Unit = {
    try
      {
        var leap = false
        val IsLeapYear = new Regex("^[0-9]{4}$")
        val year = scala.io.StdIn.readLine()
        if (IsLeapYear.matches(year))
          {
            val intYear = Integer.parseInt(year)
            if (intYear % 4 == 0)
            {
              if( intYear % 100 == 0)
                {
                  if (intYear % 400 == 0) leap = true
                  else leap = false
                }
                else {
                leap = true
              }
            }
            else leap = false
          }
        if(leap)
          println("Leap Year!")
        else
          println("Not a leap Year!")
      }
    catch
      {
        case ex : IOException =>
        {
          println("IO Exception")
        }
        case ex : ArithmeticException =>
        {
          println("Arithmetic Exception")
        }
      }
  }
}