package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader


case class ParquetReader(var path: String) extends Reader {
  override def open(): Unit = System.out.println(s"ParquetReader opened parquet on path ${path}")
}