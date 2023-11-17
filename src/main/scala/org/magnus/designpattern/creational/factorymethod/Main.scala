package org.magnus.designpattern.creational.factorymethod


object Main {

  def main(args: Array[String]): Unit = {
    val csvReader: Reader = ReaderFactory("file.csv")
    csvReader.open()
    val jsonReader: Reader = ReaderFactory("file.json")
    jsonReader.open()
    val parquetReader: Reader = ReaderFactory("file.parquet")
    parquetReader.open()
  }
}
