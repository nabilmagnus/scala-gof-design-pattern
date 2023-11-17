package org.magnus.designpattern.creational.abstractfactory

import scala.collection.mutable


object FactoryProvider {
  private val default: AbstractFactory = new CsvFactory
  private val factories: mutable.HashMap[String, AbstractFactory] = mutable.HashMap("json" -> new JsonFactory, "csv" -> default)

  def factory = factories.getOrElse(System.getProperty("fileType"), default)
}

