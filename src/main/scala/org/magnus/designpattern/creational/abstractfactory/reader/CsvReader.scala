package org.magnus.designpattern.creational.abstractfactory.reader

import org.magnus.designpattern.creational.abstractfactory.options.Options

case class CsvReader(private var path: String) extends Reader {
  override def open(options: Options): Unit = println(s"CsvReader opened csv on path ${path} with ${options.getOptions}")
}

