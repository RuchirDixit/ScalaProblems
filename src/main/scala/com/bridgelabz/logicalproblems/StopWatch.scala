package com.bridgelabz.logicalproblems

/**
 * author - Ruchir
 * date - 03-11-2020
 * time - 20:39
 * package - com.bridgelabz.logicalproblems
 * title - Print elapsed time between start and end clicks
 */
object StopWatch {
  var startTime : Long = 0
  var elapsedTime: Long = 0

  // method to start stopwatch and start counting seconds
  def start() = {
    try{
      startTime = System.currentTimeMillis
    }
    catch{
      case _ : Exception =>{
        println("Undefined Exception occurred")
      }
    }
  }
  // method to stop stopwatch and calculate time elapsed from the start click
  def stop() = {
    try{
      elapsedTime = System.currentTimeMillis - startTime
      println("Elapsed time : " + elapsedTime * 0.001 + " seconds")
    }
    catch{
      case _ : Exception =>{
        println("Undefined Exception occurred")
      }
    }
  }
}
