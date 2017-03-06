package main.scala

/**
  * Created by vasudvis on 8/13/2016.
  */
object NumberOps {
  def main(args: Array[String]) = {
    val in = 1222; // with type inference.
    println(in);

    // parsing fron string
    val int = "100".toInt; // toLong , toDouble

    //Handling very large number
    val bgNUmber = BigInt(12345454454L);
    val bgDecimal = BigDecimal(23232.434343);
    // unlike java , they support all kind of numeric operations.

    val num1 = BigInt(23234);
    val num2 = BigInt(23235);

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)


  }
}
