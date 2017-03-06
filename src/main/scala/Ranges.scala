/**
  * Created by vasudvis on 8/12/2016.
  */
object Ranges {
  def main(args: Array[String]) {
    (1 to 100).foreach(println(_));

    (1 until 10).foreach(println(_));

    (1 to 10 by 3).foreach(println(_));

    (1.0f to 10.0f by 0.5f ).foreach(println(_));

    val list : List[Int] = (1 to 100).toList;
    val arr : Array[Int] = (1 to 1000).toArray

    for( i <- list) {
      println(i)
    }


  }
}
