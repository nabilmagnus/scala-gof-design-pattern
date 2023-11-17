package org.magnus.designpattern.creational.factorymethod


trait Factory {
  def apply(s: String): Reader
}
