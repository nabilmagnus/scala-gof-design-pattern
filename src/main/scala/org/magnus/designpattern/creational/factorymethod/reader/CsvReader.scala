package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader

case class CsvReader(var path: String) extends Reader {
  override def open(): Unit = println(s"CsvReader opened csv on path ${path}")
}