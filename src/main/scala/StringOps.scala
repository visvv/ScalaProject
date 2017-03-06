/**
  * Created by vasudvis on 8/12/2016.
  */
object StringOps {
  def main(args: Array[String]) = {
    val str: String = "Hello";
    println(str);

   // print charachters in string
    "Scala is simple".foreach((ch)=>{ println(ch)});
    "Scala is simple".foreach(println(_));
    "Scala is simple".foreach(println);


    val str1 = "Hi Scala";
    val str2 = "Hi Scala";

    println(str1 == str2) // comapring two strings in scala
    // advantage here is it will not throw any null pointer exception

    //creating multiline strings "" "xxx" ""
    val multilineStr =
      """line one
        |line two
        |line three
      """.stripMargin
     println(multilineStr);

    val products = "milk,bred,cheese,butter,jam".split(",")
    products.foreach(println);

    val productNames = "milk, bred, cheese, butter, jam".split(",").map(_.trim);
    productNames.foreach(println);


    // string interpolation , replacing variable name with value in string.
    val name = "vishnu"
    println(s"My name is $name")
    // actaully s is a method
    val myName = s"My name is $name"
    println(myName)

    val strEg = "HI THIS IS SCALA".filter( _ != 'I').map(_.toLower);
    println(strEg);


  }
}
