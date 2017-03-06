package main.scala.method

/**
  * Created by vasudvis on 11/9/2016.
  */
object Simple {

  def main(args : Array[String]): Unit ={
     println(getString);
     showName("this is the name")
     showDetails("steve", "steve@gmail.com")
     showDetails(email = "steve@gmail.com", name = "steve")
     println(getAddress())


  }

  def getString : String = "this is the string";

  def showName (name : String) : Unit = println(name);

  def getAddress(add : String = "default add" ) : String = add;
  def showDetails (name : String , email: String ) : Unit = println("name : %s , email : %s ".format(name, email));

}

class Animal {
  def walk = "Using 4 legs"
}

class Human extends Animal{
  override def walk = "using two legs"
}
