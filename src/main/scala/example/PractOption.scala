package example

import scala.language.postfixOps

object PractOption {

  case class Movie(movieid: Option[Long], name: String)

  def main(args: Array[String]): Unit = {

    val movies = Seq(
      Movie(None, "The Lord of the Rings"),
      Movie(None, "End Game"),
      Movie(None, "Robocop"),
      Movie(None, "Jojo Rabit"),
      Movie(None, "Man of Steel"),
      Movie(None, "Avengers"),
      Movie(None, "Barbie"),
      Movie(None, "Transformers"),
      Movie(None, "Spider-Man"),
      Movie(None, "Spider-Man")
    )
    val sorted = movies map { _.name } sorted

    val distinct = movies.map(_.name).sorted.distinct

    val groupBy = movies.groupBy(m => m.name)

    val sum = movies
      .groupBy(_.name)
      .map(e => (e._1, e._2.length))

    sum foreach { case (key, value) => println(s"${key} ${value}") }

  }
}
