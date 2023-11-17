package org.magnus.designpattern.creational.abstractfactory.options

class CsvOptions extends Options {
  override def getOptions(): String = "csv options specific for csv files"
}