package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader


case class parquetReader(var path: String) extends Reader {
  override def open(): Unit = System.out.println(s"parquetReader opened parquet on path ${path}")
}