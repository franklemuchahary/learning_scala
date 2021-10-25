import java.io._
import scala.io._

object Solution {
	def filter_implement(delim:Int, arr:List[Int]):List[Int] = {
		/// manual implementation of basic filter function in a functional style for comparing less than
	    arr match {
	        case arr if arr.length == 0 => arr
	        case arr if arr.head < delim => List(arr.head) ++ filter_implement(delim, arr.tail)
	        case arr => filter_implement(delim, arr.tail)
	    }
	}

	def test(delim:Int, arr:List[Int]){
		println(delim)
		println(arr)
		println(delim.getClass)
		println(arr.getClass)
	}

	def main(args : Array[String]){
		var num = StdIn.readLine.trim.toInt
		var arr = StdIn.readLine.split(" ").map(x => x.trim.toInt).toList
		var result = filter_implement(num, arr)	
		println(result)
	}
}

