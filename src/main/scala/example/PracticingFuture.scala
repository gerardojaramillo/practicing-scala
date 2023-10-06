package example

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object PracticingFuture {

  def main(args: Array[String]): Unit = {

    def compute(n: Int): Future[Int] = Future { n * 3 }

    val result = for {
      result1 <- compute(3)
      result2 <- compute(5)
    } yield (result1 + result2)

    result.foreach(println _)

    val i = compute(5)
    val j = compute(3)

    val r = i flatMap { ir => j map { jr => ir + jr } }
    r foreach (println _)

    Thread.sleep(1000)

  }

}
