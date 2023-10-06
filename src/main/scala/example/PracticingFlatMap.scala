/** PracticingFlatMap.scala
  */

package example

object PracticingFlatMap {

  def main(args: Array[String]): Unit = {

    val months = Seq(" January", "February  ", "  March") map { _.trim }

    months foreach (println _)

  }

}
