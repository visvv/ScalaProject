package main.scala

/**
  * Created by vasudvis on 8/13/2016.
  */
object Controlls {
  def main(args: Array[String]) {
    val flag = true

    val amount = if (flag) 100 else 200;

    // for loog

    val fruits = Array("apple", "banana", "grapes")

    for (fruit <- fruits) println(fruit)
    val arr = Array("one", "Two", "Three");
    for (i <- arr) println(i);

    for (i <- arr) {
      val cap = i.toUpperCase; println(cap);
    }


    // counter
    for (i <- 0 to (arr.length - 1)) {
      println(i + " - " + arr(i));
    }
    // multiple condition for loop
    for {i <- 0 to arr.length - 1
         if (i % 2 == 0)
    } {
      println(i)
    }

    // foreach
    arr.foreach((a) => println(a));
    arr.foreach((a) => println(a.toLowerCase));
    arr.foreach((a) => println(a.toUpperCase));


  }
}
