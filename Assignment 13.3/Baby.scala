

object Baby {
  
  //method used to find the square root of the number using babylonian method
  def squareroot(num:Int): Float = {
    var x:Float =num
    var y:Float = 1 
    val e:Double = 0.000001     //accuracy check 
    while(x-y>e){
      x =( x+y)/2
      y = num/x
    }
    x
  }
  
  
  //main method for the control entry
  def main(args:Array[String]):Unit = {
    println("Enter the number:")
    var number = readInt()
    
    println(s"Square root of $number is ${squareroot(number)}")
  }
}