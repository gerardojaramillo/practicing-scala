/** PracticingReadFile.scala
  */

package example

import scala.io.Source
import java.nio.file.Files
import scala.io.Codec
import scala.util.Using
import scala.util.Try
import java.io.InputStream
import java.io.FileInputStream

object PracticingReadFile {

  val source = ClassLoader.getSystemResource("source.csv").toURI()

  def main(args: Array[String]): Unit = {
    Using(Source.fromFile(source)(Codec.UTF8)) { buffered =>
      buffered.getLines().zipWithIndex.foreach {
        case (line, lineno) => {
          val split = line.split(",").map(_.trim)
          println(s"line: ${split(0)} ${split(1)},${split(2)}")
        }
      }
    }
  }

}
