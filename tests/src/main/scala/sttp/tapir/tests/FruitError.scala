package sttp.tapir.tests

case class FruitError(msg: String, code: Int) extends RuntimeException
