package org.magnus.designpattern.creational.abstractfactory

import org.magnus.designpattern.creational.abstractfactory.options.{JsonOptions, Options}
import org.magnus.designpattern.creational.abstractfactory.reader.{JsonReader, Reader}

class JsonFactory extends AbstractFactory {
  override var options: Options = new JsonOptions

  override def reader(path: String): Reader = JsonReader(path)
}
