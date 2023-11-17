package org.magnus.designpattern.creational.factorymethod


abstract class Reader {
  var path: String

  def open(): Unit
}