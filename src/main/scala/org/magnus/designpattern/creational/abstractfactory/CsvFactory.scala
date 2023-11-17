package org.magnus.designpattern.creational.abstractfactory

import org.magnus.designpattern.creational.abstractfactory.options.{CsvOptions, Options}
import org.magnus.designpattern.creational.abstractfactory.reader.{CsvReader, Reader}


class CsvFactory extends AbstractFactory {
  override var options: Options = new CsvOptions

  override def reader(path: String): Reader = CsvReader(path)
}
