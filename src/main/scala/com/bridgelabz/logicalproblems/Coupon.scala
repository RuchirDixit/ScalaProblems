package com.bridgelabz.logicalproblems
import scala.util.Random
/**
 * author - Ruchir
 * date - 03-11-2020
 * time - 20:28
 * package - com.bridgelabz.logicalproblems
 * title - Random numbers to generate N distinct coupon number
 */

object Coupon {
  /**
   *
   * @param total : total number of coupons to generate
   *  Output : Randomly generated coupons between minimum value and maximum value
   */
  def generateCoupons( total: Int): Unit = {
      try {
        val MinimumValue = 500
        val MaximumValue = 100000
        var distinctCoupons: Set[Int] = Set()
        var totalCoupons = total
        for ( _ <- 0 until totalCoupons) {
          distinctCoupons += (1 + Random.nextInt(MinimumValue) * Random.nextInt(MaximumValue))
        }
        distinctCoupons.foreach(coupon => println("Coupon : "+coupon))
      }
      catch {
        case _ : Exception => {
          println("Error, Undefined exception occurred")
        }
      }
    }
}
