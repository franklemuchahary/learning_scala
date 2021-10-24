import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    def simpleArraySum(ar: Array[Int]): Int = {
        // Write your code here
        println(ar.mkString(" "))
        var sum_val = 0
        for (i <- ar){
            println(i)
            sum_val += i
        }
        println(ar.sum)
        return sum_val
    }

}

object Solution {
    def main(args: Array[String]) {

        val arCount = StdIn.readLine.trim.toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.simpleArraySum(ar)

        println(result)
    }
}