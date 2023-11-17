package org.magnus.designpattern.creational.abstractfactory.reader

import org.magnus.designpattern.creational.abstractfactory.options.Options

case class JsonReader(private var path: String) extends Reader {
  override def open(options: Options): Unit = println(s"JsonReader opened json on path ${path} with ${options.getOptions}")
}