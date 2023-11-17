package org.magnus.designpattern.creational.factorymethod

import org.magnus.designpattern.creational.factorymethod.reader.{CsvReader, JsonReader, ParquetReader}


object ReaderFactory extends Factory {

  def apply(s: String): Reader = {
    var pos = s.lastIndexOf(".")
    if (pos < 0) {
      pos = 0
    }
    val endsWith = s.substring(pos)
    endsWith match {
      case ".csv" => CsvReader(s)
      case ".json" => JsonReader(s)
      case ".parquet" => ParquetReader(s)
      case _ => throw new RuntimeException("Unknown file type")
    }
  }
}