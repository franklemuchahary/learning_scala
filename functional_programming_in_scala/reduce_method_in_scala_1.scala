/// implement a method of caluclate sum of all elements of a List
/// implement using recursion and using reduce

import scala.io._

object Solution {

	def sum_recursion(arr:List[Int], sum_val: Int = 0):Int = {
		/// recursive implementation for calculating sum of elements of a List
		arr match {
			case Nil => sum_val
			case arr => sum_recursion(arr = arr.tail, sum_val = sum_val + arr.head)
		}
	}

	def helper_function(x:Int, y:Int):Int = {
		/// helper function for showing how reduce works
		println(s"current value of x=${x} and current value of y=${y}")
		println(s"sum so far ${x+y}")

		return x + y
	}


	def sum_using_reduce(arr:List[Int]):Int = {
		/// calculate sum using reduce method
		return arr.reduce((x, y) => helper_function(x, y)) 	
	}


	def main(args: Array[String]){
		var test_list = List(10,20,30,50,50,5,5)
		var result_1 = sum_recursion(test_list)
		var result_2 = sum_using_reduce(test_list)

		println(result_1, result_2)
	}

}