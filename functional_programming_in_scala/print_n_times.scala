object Solution extends App {
    def f(n:Int) = {
        (0 until n).map(x => println("Hello World"))
    }

  var n = scala.io.StdIn.readInt
  f(n)
}