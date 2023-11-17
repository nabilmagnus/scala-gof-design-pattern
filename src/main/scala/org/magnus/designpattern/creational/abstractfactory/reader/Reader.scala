package org.magnus.designpattern.creational.abstractfactory.reader

import org.magnus.designpattern.creational.abstractfactory.options.Options

abstract class Reader {
  def open(options: Options): Unit
}

