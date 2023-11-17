package org.magnus.designpattern.creational.factorymethod


object Main {

  def main(args: Array[String]): Unit = {
    val csvReader = ReaderFactory("file.csv")
    csvReader.open()
    val jsonReader = ReaderFactory("file.json")
    jsonReader.open()
    val parquetReader = ReaderFactory("file.parquet")
    parquetReader.open()
  }
}
