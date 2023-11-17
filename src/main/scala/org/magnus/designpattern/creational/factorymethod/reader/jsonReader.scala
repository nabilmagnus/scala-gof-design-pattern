package org.magnus.designpattern.creational.factorymethod.reader

import org.magnus.designpattern.creational.factorymethod.Reader


case class jsonReader(var path: String) extends Reader {
  override def open(): Unit = println(s"jsonReader opened json on path ${path}")
}
