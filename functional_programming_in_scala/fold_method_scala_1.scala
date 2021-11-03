import scala.io._
 
/// calculate the length of a list in scala using recursion
/// implement the same thing using the fold method available in scala


object Solution{

	def arr_length_recusion(arr:List[Int], len:Int=0):Int = {
		/// recursive implementation
		arr match {
			case Nil => len
			case arr => arr_length_recusion(arr = arr.tail, len = len + 1)
		}
	}

	def helper_function_internal_working_fold(x:Int, y:Int):Int = {
		/// we can see that y has the actual values at that point in iteration
		/// x has the values returned from the previous iteration
		/// x is being initialized to 0 because of the 0 being passed to fold initially (this is the difference between reduce and fold, we can intialize values in fold)
		/// this is similar to how we would manually implement a recursive function like the one implemented above
		println("value of x =" + x + " and value of y=" + y)
		var return_val = x + 1
		return return_val
	}

	def arr_length_fold(arr:List[Int]):Int = {
		/// implementation using fold
		/// use the helper function instead of the lambda function to see how fold actually works step-by-step

		return arr.fold(0)(helper_function_internal_working_fold)
		//return arr.fold(0)((x:Int, y:Int) => x + 1)
	}

	def main(args: Array[String]){
		var test_arr = List(10,23,35,41,54,69,71,89)
		
		var result = arr_length_recusion(test_arr)

		var result_fold = arr_length_fold(test_arr)
		println("Recursion Result: " + result.toString)
		println("Fold Result: " + result_fold.toString)
	}
}

