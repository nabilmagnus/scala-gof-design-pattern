package org.magnus.designpattern.creational.builder

case class GuitarBuilder private(
                                  isElectric: Boolean = false,
                                  numberOfStrings: Int = 6,
                                  tuning: String = "standard",
                                  tone: String = "clean",
                                  reverb: Float = 0.0f,
                                  delay: Int = 0
                                ) {
  def isElectric(isElectric: Boolean): GuitarBuilder =
    copy(isElectric = isElectric)

  def numberOfStrings(nStrings: Int): GuitarBuilder =
    copy(numberOfStrings = nStrings)

  def tuning(tuning: String): GuitarBuilder =
    copy(tuning = tuning)

  def tone(tone: String): GuitarBuilder =
    copy(tone = tone)

  def reverb(reverb: Float): GuitarBuilder =
    copy(reverb = reverb)

  def delay(delay: Int): GuitarBuilder =
    copy(delay = delay)

  def build() = Guitar(
    isElectric = isElectric,
    numberOfStrings = numberOfStrings,
    tuning = tuning,
    tone = tone,
    reverb = reverb,
    delay = delay
  )
}