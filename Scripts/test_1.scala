class Point(xc:Int, yc:Int){ // this itself acts as the class constructor
    var x = xc
    var y = yc
    
    // this is a method defined in scala
    def move(dx:Int, dy:Int){
        x += dx
        y += dy
        
        println("New X Coordinate is: " + x)
        println("New Y Coordinate is: " + y)
    }
}

object Test{
    def main(args : Array[String]){
        var my_obj = new Point(10, 20) 
        println(my_obj.x, my_obj.y)
        
        my_obj.move(10, 5) 
        
        println(my_obj.x, my_obj.y)
    }
}