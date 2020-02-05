import scala.xml.NodeBuffer

object XMLHelloWorld {

  def main(args: Array[String]): Unit = {
    val xml =  <hello>world</hello>
    println(xml)
    val nodeBuffer: NodeBuffer = <hello/><world/>
    nodeBuffer.map(println)
  }
}
