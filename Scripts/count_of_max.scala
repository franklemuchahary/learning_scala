import scala.io.StdIn.readLine

object Result {

    def birthdayCakeCandles(candles: Array[Int]): Int = {
        var max_val = candles.max 
        return candles.filter(x => x == max_val).length
    }

}

object Solution {
    def main(args: Array[String]) {

        val candlesCount = readLine.trim.toInt

        val candles = readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.birthdayCakeCandles(candles)

        println(result)
    }
}