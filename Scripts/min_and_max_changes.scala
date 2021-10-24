import java.io._
import java.math._
import java.security._
import java.text._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    def breakingRecords(scores: Array[Int]): Array[Int] = {
        // Write your code here
        var min_val = scores(0)
        var max_val = scores(0)
        var max_count = 0
        var min_count = 0
        
        
        for (i <- scores){
            if (i < min_val){
                min_count += 1
                min_val = i
            }
            
            if (i > max_val){
                max_count += 1
                max_val = i
            }
        }
        
        println(max_count, min_count)
        return Array(max_count, min_count)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter("temp_output.txt")

        val n = StdIn.readLine.trim.toInt

        val scores = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.breakingRecords(scores)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
