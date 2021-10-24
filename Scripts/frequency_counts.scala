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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def migratoryBirds(arr: Array[Int]): Int = {
    // Write your code here
        //var my_list = arr.elements.toList
        var counts = arr.groupBy(x => x).mapValues(_.size)

        var max_val = counts.map(x => x._2).max

        var result = counts.map(
            x => if (x._2 == max_val) x._1 else -1
        ).filter(
            x => x>0
        ).min

        println(result)
        return result
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter("temp_output.txt")

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
