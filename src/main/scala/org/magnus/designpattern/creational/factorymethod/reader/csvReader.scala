package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader

case class csvReader(var path: String) extends Reader {
  override def open(): Unit = println(s"csvReader opened csv on path ${path}")
}