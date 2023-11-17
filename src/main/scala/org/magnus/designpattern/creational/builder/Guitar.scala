package org.magnus.designpattern.creational.builder

case class Guitar(
                   isElectric: Boolean = false,
                   numberOfStrings: Int = 6,
                   tuning: String = "standard",
                   tone: String = "clean",
                   reverb: Float = 0.0f,
                   delay: Int = 0
                 ) {
  override def toString: String =
    s"""
       |My guitar :
       |-> isElectric: $isElectric
       |-> numberOfStrings: $numberOfStrings
       |-> tuning: $tuning
       |-> tone: $tone
       |-> reverb: $delay
       |""".stripMargin
}