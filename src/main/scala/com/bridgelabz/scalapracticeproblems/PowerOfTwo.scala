package com.bridgelabz.scalapracticeproblems

/**
 * author - Admin
 * date - 31-10-2020
 * time - 13:01
 * package - com.bridgelabz.scalapracticeproblems
 * title - Print table of power of 2 till N
 */
object PowerOfTwo {
  // Accepts value N from user and prints the table of 2 till 2^N is reached
  def main(args: Array[String]): Unit = {
    try
      {
        val value = scala.io.StdIn.readInt()
        if ( value >= 0 && value < 31)
          {
            var counter = 0
            while (scala.math.pow(2,counter) < scala.math.pow(2,value))
            {
              println("2 ^ " + counter + " = " + scala.math.pow(2,counter))
              counter += 1
            }
          }
        else
          {
            println("Invalid input!")
          }
      }
    catch
      {
        case ex : Exception =>
        {
          println("Exception")
        }
      }
  }
}
