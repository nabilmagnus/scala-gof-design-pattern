package org.magnus.designpattern.creational.builder

object Main {

  def main(args: Array[String]): Unit = {
    val guitar = GuitarBuilder()
      .isElectric(false)
      .tone("brit-j800")
      .tuning("custom")
      .build()

    println(guitar.toString)
  }
}
