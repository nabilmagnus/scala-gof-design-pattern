package org.magnus.designpattern.creational.abstractfactory

import org.magnus.designpattern.creational.abstractfactory.options.Options
import org.magnus.designpattern.creational.abstractfactory.reader.Reader

object Main extends {
  def main(args: Array[String]): Unit = {
    val csvFactory: AbstractFactory = FactoryProvider.factory
    val options: Options = csvFactory.options
    val reader: Reader = csvFactory.reader("path.csv")
    reader.open(options)
  }
}