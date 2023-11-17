package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader


case class JsonReader(var path: String) extends Reader {
  override def open(): Unit = println(s"JsonReader opened json on path ${path}")
}
