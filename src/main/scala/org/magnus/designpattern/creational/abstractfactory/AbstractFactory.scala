package org.magnus.designpattern.creational.abstractfactory

import org.magnus.designpattern.creational.abstractfactory.options.Options
import org.magnus.designpattern.creational.abstractfactory.reader.Reader

abstract class AbstractFactory {
  var options: Options

  def reader(path: String): Reader
}
