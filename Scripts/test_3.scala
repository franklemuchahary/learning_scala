import scala.io.StdIn.readLine

object Test extends App{
	print("Enter first name: ")
	val firstname = readLine()
	print("Enter last name: ")
	val lastname = readLine()

	println(s"Hello $firstname $lastname")
}