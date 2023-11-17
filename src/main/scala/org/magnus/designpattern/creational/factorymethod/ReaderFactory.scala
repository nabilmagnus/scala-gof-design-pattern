package org.magnus.designpattern.creational.factorymethod

import org.magnus.designpattern.creational.factorymethod.reader.{csvReader, jsonReader, parquetReader}


object ReaderFactory extends Factory {

  def apply(s: String): Reader = {
    var pos = s.lastIndexOf(".")
    if (pos < 0) {
      pos = 0
    }
    val endsWith = s.substring(pos)
    endsWith match {
      case ".csv" => csvReader(s)
      case ".json" => jsonReader(s)
      case ".parquet" => parquetReader(s)
      case _ => throw new RuntimeException("Unknown file type")
    }
  }
}