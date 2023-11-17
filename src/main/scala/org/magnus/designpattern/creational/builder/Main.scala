package org.magnus.designpattern.creational.builder

object Main {

  def main(args: Array[String]): Unit = {
    val guitar = GuitarBuilder()
      .withElectric(true)
      .withTone("brit-j800")
      .build()

    println(guitar.toString)
  }
}
